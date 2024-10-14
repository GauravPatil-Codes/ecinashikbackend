package com.ecinashik.backend.Controllers;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


import com.ecinashik.backend.Services.VoterServiceImpl;
import com.ecinashik.backend.dto.VoterSearchRequest;
import com.ecinashik.backend.entities.Voters;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@RestController
public class VoterController {

	@Autowired
	VoterServiceImpl voterServiceImpl;

 	@PostMapping("/create")
	public Voters CreateVoter(@RequestBody Voters voters) {

		return voterServiceImpl.CreateVoter(voters);
	}
	
	 @GetMapping("/voter/{id}")
    public ResponseEntity<Voters> getVoterById(@PathVariable String id) {
        return voterServiceImpl.getVoterById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
	@GetMapping("/voterByVoterId/{voterId}")
	public ResponseEntity<Voters> getVoterByVoterId(@PathVariable String voterId) {
		return voterServiceImpl.getVoterByVoterId(voterId)
		.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
	}

	@PostMapping("/search")
    public ResponseEntity<Map<String, Object>> searchVoters(@RequestBody VoterSearchRequest searchRequest) {
        List<Voters> voters = voterServiceImpl.searchVoters(
                searchRequest.getFullName(),
                searchRequest.getVillage(),
                searchRequest.getAge(),
                searchRequest.getGender(),
                searchRequest.getAssemblyConstituency()
        );
        
        if (voters.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        
        return ResponseEntity.ok(createResponse(voters));
    }

    private Map<String, Object> createResponse(List<Voters> voters) {
        Map<String, Object> response = new HashMap<>();
        Map<String, Object> data = new HashMap<>();
        data.put("voters", voters);
        response.put("data", data);
        response.put("status", 200);
        return response;
    }

    // This method can be used for single voter responses
    private Map<String, Object> createResponse(Voters voter) {
        Map<String, Object> response = new HashMap<>();
        Map<String, Object> data = new HashMap<>();
        data.put("voter", voter);
        response.put("data", data);
        response.put("status", 200);
        return response;
    }
	

	//  @PostMapping("/searchByInfo")
    // public ResponseEntity<Map<String, Object>> getVoterByInfo(@RequestBody VoterSearchRequest searchRequest) {
    //     return voterServiceImpl.getVoterByInfo(
    //             searchRequest.getFullName(),
    //             searchRequest.getVillage(),
    //             searchRequest.getAge(),
    //             searchRequest.getGender(),
    //             searchRequest.getAssemblyConstituency()
    //     )
    //     .map(this::createResponse)
    //     .orElse(ResponseEntity.notFound().build());
    // }

    // private ResponseEntity<Map<String, Object>> createResponse(Voters voter) {
    //     Map<String, Object> response = new HashMap<>();
    //     Map<String, Object> data = new HashMap<>();
    //     data.put("voter", voter);
    //     response.put("data", data);
    //     response.put("status", 200);
    //     return ResponseEntity.ok(response);
    // }
//  @PostMapping("/search")
//     public ResponseEntity<Map<String, Object>> searchVoters(@RequestBody VoterSearchRequest searchRequest) {
//         List<Voters> voters = voterServiceImpl.searchVoters(
//                 searchRequest.getFullName(),
//                 searchRequest.getVillage(),
//                 searchRequest.getAge(),
//                 searchRequest.getGender(),
//                 searchRequest.getAssemblyConstituency()
//         );
        
//         if (voters.isEmpty()) {
//             return ResponseEntity.notFound().build();
//         }
        
//         return ResponseEntity.ok(createResponse(voters));
//     }

    // private Map<String, Object> createResponse(List<Voters> voters) {
    //     Map<String, Object> response = new HashMap<>();
    //     Map<String, Object> data = new HashMap<>();
    //     data.put("voters", voters);
    //     response.put("data", data);
    //     response.put("status", 200);
    //     return response;
    // }


}
