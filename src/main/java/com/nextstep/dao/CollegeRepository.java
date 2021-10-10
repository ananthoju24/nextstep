package com.nextstep.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.nextstep.dao.api.CollegeDetails;

public interface CollegeRepository extends MongoRepository<CollegeDetails, String> {

	
	
}
