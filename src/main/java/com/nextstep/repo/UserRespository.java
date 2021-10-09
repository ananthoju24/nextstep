package com.nextstep.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.nextstep.dao.NextStepUser;

@Repository
public interface UserRespository extends MongoRepository<NextStepUser, String> {

	public NextStepUser findByFirstName(String firstName);

	public NextStepUser findByMobileNo(String mobileNo);
	
	public NextStepUser findByMobileNoOrEmailId(String input);

}
