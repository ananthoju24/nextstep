package com.nextstep.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/nextstep/user")
public class NextStepUserController {
	
	@PostMapping("/register")
	public ResponseEntity<String> register(){
		return ResponseEntity.ok().build();
	}

	@PostMapping("/login")
	public ResponseEntity<String> login(){
		return ResponseEntity.ok().build();
	}
	
	
}
