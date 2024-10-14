package com.ecinashik.backend.repositories;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ecinashik.backend.entities.Voters;

@Repository
public interface VoterRepository extends MongoRepository<Voters,String> {
    Optional<Voters> findByVoterId(String voterId);
	
	// Optional<Voters>findByInfo(String fullName, String village,int age,String gender,String assemblyConstituency);

}
