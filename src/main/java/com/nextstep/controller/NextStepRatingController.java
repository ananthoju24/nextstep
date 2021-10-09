package com.nextstep.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/nextstep/")
public class NextStepRatingController {

	@PostMapping("/rating")
	public ResponseEntity<String> addRating(){
		return ResponseEntity.ok().build();
	}
	
	
	@PutMapping("/rating")
	public ResponseEntity<String> updateRating(){
		return ResponseEntity.ok().build();
	}
	
	@GetMapping("/rating")
	public ResponseEntity<String> getRating(){
		return ResponseEntity.ok().build();
	}
}
