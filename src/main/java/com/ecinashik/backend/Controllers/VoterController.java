package com.ecinashik.backend.Controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecinashik.backend.Services.VoterService;
import com.ecinashik.backend.entities.Voters;



@RestController
public class VoterController {
	
	@Autowired
	VoterService voterServiceImpl;
	
	@PostMapping("/create")
	public Voters CreateVoter(@RequestBody Voters voters) {
		
		
		return voterServiceImpl.CreateVoter(voters);
		
	}
	

}
