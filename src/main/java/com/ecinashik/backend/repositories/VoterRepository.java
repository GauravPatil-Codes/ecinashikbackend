package com.ecinashik.backend.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.ecinashik.backend.entities.Voters;

@Repository
public interface VoterRepository extends MongoRepository<Voters,String> {
    Optional<Voters> findByVoterId(String voterId);

    @Query("{ $and: [ " +
           "{ $or: [ { 'fullName': ?0 }, { $expr: { $eq: [?0, null] } } ] }, " +
           "{ $or: [ { 'village': ?1 }, { $expr: { $eq: [?1, null] } } ] }, " +
           "{ $or: [ { 'age': ?2 }, { $expr: { $eq: [?2, null] } } ] }, " +
           "{ $or: [ { 'gender': ?3 }, { $expr: { $eq: [?3, null] } } ] }, " +
           "{ $or: [ { 'assemblyConstituency': ?4 }, { $expr: { $eq: [?4, null] } } ] } " +
           "] }")
    List<Voters> findByExactFields(String fullName, String village, Integer age, String gender, String assemblyConstituency);


	//  @Query("{ $or: [ " +
    //        "{ 'fullName': { $regex: ?0, $options: 'i' } }, " +
    //        "{ 'village': { $regex: ?1, $options: 'i' } }, " +
    //        "{ 'age': ?2 }, " +
    //        "{ 'gender': { $regex: ?3, $options: 'i' } }, " +
    //        "{ 'assemblyConstituency': { $regex: ?4, $options: 'i' } } " +
    //        "] }")
    // List<Voters> findByAnyField(String fullName, String village, Integer age, String gender, String assemblyConstituency);

}
