package com.nextstep.dao;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nextstep.dao.api.ReviewDetails;

@Service
public class ReviewService {
	private static final Logger log = LoggerFactory.getLogger(UserService.class);

	@Autowired
	private ReviewRespository reviewRespository;

	public ReviewDetails saveReview(ReviewDetails reviewDetails) {
		ReviewDetails rDetails = null;
		try {
			log.info(" saveReview :: " + reviewDetails);
			if (reviewDetails == null)
				return rDetails;
			rDetails = reviewRespository.save(reviewDetails);
			log.info(" saveReview :: success " + rDetails);
		} catch (Exception e) {
			log.error(" saveReview :: error ", e);
		}
		return rDetails;
	}

	public List<ReviewDetails> getReviews(String collegeId) {
		List<ReviewDetails> rDetails = null;
		try {
			log.info(" getReviews :: " + collegeId);
			if (collegeId == null)
				return rDetails;
			rDetails = reviewRespository.findReviewByCollegeId(collegeId);
			log.info(" getReviews :: success " + rDetails);
		} catch (Exception e) {
			log.error(" getReviews :: error ", e);
		}
		return rDetails;

	}
}
