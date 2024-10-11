package com.ecinashik.backend.Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecinashik.backend.Services.VoterService;
import com.ecinashik.backend.entities.Voters;
import com.ecinashik.backend.repositories.VoterRepository;

@Service
public class VoterServiceImpl implements VoterService {

	@Autowired
	VoterRepository voterRepository;
	
	@Override
	public Voters CreateVoter(Voters) {
		
	
		// TODO Auto-generated method stub
		return voterRepository.save(voters)
	}

}
