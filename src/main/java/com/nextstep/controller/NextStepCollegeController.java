package com.nextstep.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/nextstep/college")
public class NextStepCollegeController {

	
	@PostMapping("/college-details")
	public ResponseEntity<String> addCollegeDetails(){
		return ResponseEntity.ok().build();
	}
	
	@PutMapping("/college-details")
	public ResponseEntity<String> updateCollegeDetails(){
		return ResponseEntity.ok().build();
	}
	
	@GetMapping("/college-details")
	public ResponseEntity<String> getCollegeDetails(){
		return ResponseEntity.ok().build();
	}
}
