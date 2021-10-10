package com.nextstep.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.nextstep.bean.CollegeDetails;

@Service
public interface CollegeService {

	ResponseEntity<CollegeDetails> findCollege(CollegeDetails collegeDetails);

}
