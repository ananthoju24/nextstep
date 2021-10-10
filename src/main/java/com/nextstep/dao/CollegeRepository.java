package com.nextstep.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.nextstep.dao.api.CollegeDetails;

public interface CollegeRepository extends MongoRepository<CollegeDetails, String> {

	public CollegeDetails findCollegeByName(String name);

	public CollegeDetails findCollegeById(String id);

	public List<CollegeDetails> findByNameContains(String name);

}
