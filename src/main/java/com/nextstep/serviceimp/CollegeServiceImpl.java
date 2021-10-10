package com.nextstep.serviceimp;

import org.springframework.http.ResponseEntity;

import com.nextstep.bean.CollegeDetails;
import com.nextstep.service.CollegeService;

public class CollegeServiceImpl implements CollegeService{

	@Override
	public ResponseEntity<CollegeDetails> findCollege(CollegeDetails collegeDetails) {
		
		return null;
	}

}
