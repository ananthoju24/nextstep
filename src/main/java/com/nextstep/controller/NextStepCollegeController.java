package com.nextstep.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nextstep.bean.CollegeDetails;
import com.nextstep.service.CollegeService;

@RestController
@RequestMapping("/v1/nextstep/college")
public class NextStepCollegeController {

	CollegeService collegeService;
	
	@PostMapping("/college-details")
	public ResponseEntity<String> addCollegeDetails(){
		return ResponseEntity.ok().build();
	}
	
	@PutMapping("/college-details")
	public ResponseEntity<String> updateCollegeDetails(){
		return ResponseEntity.ok().build();
	}
	
	
	@GetMapping("/college-details/")
	
	public ResponseEntity<CollegeDetails> getCollegeDetails(@RequestBody CollegeDetails collegeDetails){
		
		
		return collegeService.findCollege(collegeDetails);
	}
}
