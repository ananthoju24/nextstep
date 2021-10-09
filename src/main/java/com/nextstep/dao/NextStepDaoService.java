package com.nextstep.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nextstep.repo.UserRespository;

@Service
public class NextStepDaoService {

	@Autowired
	private UserRespository userRespository;
	private static final Logger log = LoggerFactory.getLogger(NextStepDaoService.class);

	public int registerUser(NextStepUser nextStepUser) {
		int result = 0;
		try {
			log.info("registerUser :: " + nextStepUser);
			if (nextStepUser == null)
				return result;
			userRespository.save(nextStepUser);
			log.info("registerUser :: success");
		} catch (Exception e) {
			log.error("registerUser :: error ", e);
			result = -1;
		}
		return result;
	}

	public NextStepUser findByMobileNo(String mobileNo) {
		NextStepUser nextStepUser = null;
		try {
			log.info("findByMobileNo :: " + mobileNo);
			if (mobileNo == null || mobileNo.isEmpty())
				return nextStepUser;
			nextStepUser = userRespository.findByMobileNo(mobileNo);
			log.info("findByMobileNo :: success " + nextStepUser);
		} catch (Exception e) {
			log.error("findByMobileNo :: error ", e);
		}
		return nextStepUser;
	}
}
