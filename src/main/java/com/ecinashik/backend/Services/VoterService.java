package com.ecinashik.backend.Services;

import java.util.Optional;

import com.ecinashik.backend.entities.Voters;

public interface VoterService {
	
	Voters CreateVoter(Voters voters);
	Optional<Voters> getVoterById(String id);
	Optional<Voters> getVoterByVoterId(String voterId);
	// Optional<Voters>getVoterByInfo(String fullName, String village,int age,String gender,String assemblyConstituency);
}
