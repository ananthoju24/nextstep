package com.nextstep.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/nextstep")
public class NextStepReviewController {

	
	@PostMapping("/review")
	public ResponseEntity<String> addReview(){
		return ResponseEntity.ok().build();
	}
	
	@PutMapping("/review")
	public ResponseEntity<String> updateReview(){
		return ResponseEntity.ok().build();
	}
	
	@GetMapping("/review")
	public ResponseEntity<String> getReview(){
		return ResponseEntity.ok().build();
	}
	
}
