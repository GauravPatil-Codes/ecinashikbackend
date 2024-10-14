package com.ecinashik.backend.Services;

import java.util.List;
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
	@Override
    public List<Voters> searchVoters(String fullName, String village, Integer age, String gender, String assemblyConstituency) {
        return voterRepository.findByExactFields(fullName, village, age, gender, assemblyConstituency);
    }

	// @Override
    // public List<Voters> searchVoters(String fullName, String village, Integer age, String gender, String assemblyConstituency) {
    //     return voterRepository.findByAnyField(fullName, village, age, gender, assemblyConstituency);
    // }
	
}