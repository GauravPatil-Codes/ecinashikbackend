package com.ecinashik.backend.Services;

import java.util.List;
import java.util.Optional;

import com.ecinashik.backend.entities.Voters;

public interface VoterService {
	
	Voters CreateVoter(Voters voters);
	  	Optional<Voters> getVoterById(String id);
	Optional<Voters> getVoterByVoterId(String voterId);
	List<Voters> searchVoters(String fullName, String village, Integer age, String gender, String assemblyConstituency);
	Voters updateVoterById(String id, Voters voters);
}
