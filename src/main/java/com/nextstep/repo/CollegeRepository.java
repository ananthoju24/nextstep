package com.nextstep.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.nextstep.dao.NextStepUser;

public interface CollegeRepository extends MongoRepository<NextStepUser, String> {

	
}
