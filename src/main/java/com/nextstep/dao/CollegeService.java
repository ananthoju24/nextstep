package com.nextstep.dao;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nextstep.dao.api.CollegeDetails;

@Service
public class CollegeService {
	private static final Logger log = LoggerFactory.getLogger(UserService.class);

	@Autowired
	private CollegeRepository collegeRepository;

	public CollegeDetails saveCollege(CollegeDetails collegeDetails) {
		CollegeDetails resp = null;
		try {
			log.info("saveCollege :: " + collegeDetails);
			if (collegeDetails == null)
				return resp;
			resp = collegeRepository.save(collegeDetails);
			log.info("saveCollege :: success " + resp);
		} catch (Exception e) {
			log.error("saveCollege :: error ", e);
		}
		return resp;

	}

	public CollegeDetails findCollegeByName(String name) {
		CollegeDetails resp = null;
		try {
			log.info("findCollegeByName :: " + name);
			if (name == null)
				return resp;
			resp = collegeRepository.findCollegeByName(name);
			log.info("findCollegeByName :: success " + resp);
		} catch (Exception e) {
			log.error("findCollegeByName :: error ", e);
		}
		return resp;

	}

	public CollegeDetails findCollegeById(String id) {
		CollegeDetails resp = null;
		try {
			log.info("findCollegeById :: " + id);
			if (id == null)
				return resp;
			resp = collegeRepository.findCollegeById(id);
			log.info("findCollegeById :: success " + resp);
		} catch (Exception e) {
			log.error("findCollegeById :: error ", e);
		}
		return resp;

	}

	public List<CollegeDetails> searchCollege(String name) {
		List<CollegeDetails> resp = null;
		try {
			log.info("searchCollege :: " + name);
			if (name == null)
				return resp;
			resp = collegeRepository.findByNameContains(name);
			log.info("searchCollege :: success " + resp);
		} catch (Exception e) {
			log.error("searchCollege :: error ", e);
		}
		return resp;

	}
}
