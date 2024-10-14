package com.ecinashik.backend.Services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecinashik.backend.entities.Voters;
import com.ecinashik.backend.repositories.VoterRepository;


@Service
public class VoterServiceImpl implements VoterService {

	@Autowired
	VoterRepository voterRepository;

	@Override
	public Voters CreateVoter(Voters voters) {
			return voterRepository.save(voters);
	}

	
	@Override
    public Optional<Voters> getVoterById(String id) {
        return voterRepository.findById(id);
    }
	@Override
    public Optional<Voters> getVoterByVoterId(String voterId) {
        return voterRepository.findByVoterId(voterId);
    }
	// @Override
    // public Optional<Voters> getVoterByInfo(String fullName, String village,int age,String gender,String assemblyConstituency) {
    //     return voterRepository.findByInfo(fullName, village,age,gender,assemblyConstituency);
    // }
}