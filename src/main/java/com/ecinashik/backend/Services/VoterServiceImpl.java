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
        return voterRepository.findByFields(
            isNullOrEmpty(fullName) ? null : fullName,
            isNullOrEmpty(village) ? null : village,
            age,
            isNullOrEmpty(gender) ? null : gender,
            isNullOrEmpty(assemblyConstituency) ? null : assemblyConstituency
        );
    }

    private boolean isNullOrEmpty(String str) {
        return str == null || str.trim().isEmpty();
    }

	@Override
    public Voters updateVoterById(String id, Voters voters) {
        Optional<Voters> existingVotersOptional = voterRepository.findById(id);
    
        if (existingVotersOptional.isPresent()) {
            Voters existingVoters = existingVotersOptional.get();
    
            // Update fields of the existing voter
            existingVoters.setFullName(voters.getFullName());
            existingVoters.setAge(voters.getAge());
            existingVoters.setGender(voters.getGender());
            existingVoters.setVoterId(voters.getVoterId());
            existingVoters.setDistrict(voters.getDistrict());
            existingVoters.setAssemblyConstituency(voters.getAssemblyConstituency());
            existingVoters.setBlockNameBlockNumber(voters.getBlockNameBlockNumber());
            existingVoters.setBoothURL(voters.getBoothURL());
            existingVoters.setBoothAddress(voters.getBoothAddress());
            existingVoters.setBoothName(voters.getBoothName());
            existingVoters.setVillage(voters.getVillage());
            existingVoters.setDob(voters.getDob());
    
            // Save and return the updated voter
            return voterRepository.save(existingVoters);
        } else {
            // Return null if voter is not found
            return null;
        }
    }
    

}