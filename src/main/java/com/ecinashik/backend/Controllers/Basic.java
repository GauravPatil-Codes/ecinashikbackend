package com.ecinashik.backend.Controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Basic {
	

	@GetMapping("/")
	@ResponseBody
	public String check() {
		return "I am live and working";
	}

}
