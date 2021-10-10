package com.nextstep.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nextstep.dao.api.NextStepUser;

@Service
public class UserService {

	private static final Logger log = LoggerFactory.getLogger(UserService.class);

	@Autowired
	private UserRespository userRespository;

	public int registerUser(NextStepUser nextStepUser) {
		int result = 0;
		try {
			log.info("registerUser :: " + nextStepUser);
			if (nextStepUser == null || nextStepUser.getUserId() == null || nextStepUser.getUserId().isEmpty()
					|| nextStepUser.getEmailId() == null || nextStepUser.getEmailId().isEmpty()) {
				return result;
			}

			NextStepUser user = userRespository.findByMobileNoOrEmailId(
					(nextStepUser.getUserId() != null) ? nextStepUser.getUserId() : nextStepUser.getEmailId());
			if (user == null)
				userRespository.save(nextStepUser);
			else {
				BeanUtils.copyProperties(nextStepUser, user);
				userRespository.save(user);
			}
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

	public NextStepUser findByMobileNoOrEmailId(String input) {
		NextStepUser nextStepUser = null;
		try {
			log.info("findByMobileNoOrEmailId :: " + input);
			if (input == null || input.isEmpty())
				return nextStepUser;
			nextStepUser = userRespository.findByMobileNo(input);
			log.info("findByMobileNoOrEmailId :: success " + nextStepUser);
		} catch (Exception e) {
			log.error("findByMobileNoOrEmailId :: error ", e);
		}
		return nextStepUser;

	}

}
