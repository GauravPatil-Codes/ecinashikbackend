package com.ecinashik.backend.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ecinashik.backend.entities.Voters;

@Repository
public interface VoterRepository extends MongoRepository<Voters,String> {
	
	
	

}
