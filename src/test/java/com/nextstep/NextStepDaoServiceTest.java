package com.nextstep;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.nextstep.dao.CollegeService;
import com.nextstep.dao.ReviewService;
import com.nextstep.dao.UserRespository;
import com.nextstep.dao.UserService;
import com.nextstep.dao.api.CollegeDetails;
import com.nextstep.dao.api.NextStepUser;
import com.nextstep.dao.api.ReviewDetails;

@SpringBootTest
public class NextStepDaoServiceTest {

	@Autowired
	private UserService daoService;
	@Autowired
	private CollegeService collegeService;
	@Autowired
	private ReviewService reviewService;

	// @MockBean
	@Autowired
	private UserRespository userRespository;


	@Test
	public void testRegisterUser() {
		/*
		 * NextStepUser nextStepUser = new NextStepUser();
		 * nextStepUser.setUserId("arun24"); nextStepUser.setMobileNo("8019692761");
		 */
		NextStepUser nextStepUser1 = new NextStepUser();
		nextStepUser1.setUserId("sri");
		nextStepUser1.setMobileNo("8977145141");
		NextStepUser nextStepUser2 = new NextStepUser();
		nextStepUser2.setUserId("siri");
		nextStepUser2.setMobileNo("8019692762");
		nextStepUser2.setEmailId("arun23@yopmail.com");
		// assertEquals(0, daoService.registerUser(nextStepUser));
		assertEquals(0, daoService.registerUser(nextStepUser1));
		assertEquals(0, daoService.registerUser(nextStepUser2));
	}

	@Test
	public void findByMobileNo() {
		NextStepUser nextStepUser = new NextStepUser();
		nextStepUser.setUserId("sri");
		nextStepUser.setMobileNo("8977145141");
		Mockito.when(userRespository.findByMobileNo("8977145141")).thenReturn(nextStepUser);
		assertEquals("sri", daoService.findByMobileNo("8977145141").getUserId());
	}

	@Test
	public void findByMobileNoOrEmailid() {
		NextStepUser nextStepUser = new NextStepUser();
		nextStepUser.setUserId("siri");
		nextStepUser.setMobileNo("8019692762");
		nextStepUser.setEmailId("arun23@yopmail.com");
		Mockito.when(daoService.findByMobileNoOrEmailId("8019692762")).thenReturn(nextStepUser);
		Mockito.when(daoService.findByMobileNoOrEmailId("arun24@yopmail.com")).thenReturn(nextStepUser);
		assertEquals("siri", daoService.findByMobileNoOrEmailId("8019692762").getUserId());
		assertEquals("siri", daoService.findByMobileNoOrEmailId("arun24@yopmail.com").getUserId());

	}

	//@Test
	public void saveCollege() {
		CollegeDetails collegeDetails = new CollegeDetails();
		collegeDetails.setName("CBIT");
		collegeDetails.setContactNo("91-9000000000");
		collegeDetails.setCity("Rajendranagar");
		collegeDetails.setState("Telangana");
		collegeDetails.setCountry("India");
		collegeDetails.setAddress("Near gandipet");
		assertNotNull(collegeService.saveCollege(collegeDetails));
	}

	@Test
	public void testReview() {
		CollegeDetails collegeDetails  = collegeService.findCollegeByName("CBIT");
		ReviewDetails reviewDetails = new ReviewDetails();
		reviewDetails.setCollegeId(collegeDetails.getId());
		reviewDetails.setRating(5);
		reviewDetails.setReview("One of the best college in top 10 in Telagana. Will have good placements");
		reviewDetails.setUserId("siri");
		assertNotNull(reviewService.saveReview(reviewDetails));
	}
}
