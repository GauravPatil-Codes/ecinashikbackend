package com.ecinashik.backend.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.ecinashik.backend.entities.Voters;

@Repository
public interface VoterRepository extends MongoRepository<Voters,String> {
  
    @Query("{ $and: [ " +
    "{ $or: [ { 'fullName': ?0 }, { $expr: { $in: [?0, [null, ''] ] } } ] }, " +
    "{ $or: [ { 'village': ?1 }, { $expr: { $in: [?1, [null, ''] ] } } ] }, " +
    "{ $or: [ { 'age': ?2 }, { $expr: { $eq: [?2, null] } } ] }, " +
    "{ $or: [ { 'gender': ?3 }, { $expr: { $in: [?3, [null, ''] ] } } ] }, " +
    "{ $or: [ { 'assemblyConstituency': ?4 }, { $expr: { $in: [?4, [null, ''] ] } } ] } " +
    "] }")
List<Voters> findByFields(String fullName, String village, Integer age, String gender, String assemblyConstituency);

Optional<Voters> findByVoterId(String voterId);

}
