package com.nextstep.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.nextstep.dao.api.ReviewDetails;

public interface ReviewRespository extends MongoRepository<ReviewDetails, String> {

	public List<ReviewDetails> findReviewByCollegeId(String collegeId);
	
	//public List<ReviewDetails> findByCollegeIdReviewBy
	
}
