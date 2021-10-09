package com.nextstep;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.nextstep.dao.NextStepDaoService;
import com.nextstep.dao.NextStepUser;
import com.nextstep.repo.UserRespository;

@SpringBootTest
public class NextStepDaoServiceTest {

	@Autowired
	private NextStepDaoService daoService;

	@MockBean
	private UserRespository userRespository;

	@Test
	public void testRegisterUser() {
		NextStepUser nextStepUser = new NextStepUser();
		nextStepUser.setUserId("arun24");
		nextStepUser.setMobileNo("8019692761");
		assertEquals(0, daoService.registerUser(nextStepUser));
	}

	@Test
	public void findByMobileNo() {
		NextStepUser nextStepUser = new NextStepUser();
		nextStepUser.setUserId("arun24");
		nextStepUser.setMobileNo("8019692761");
		Mockito.when(userRespository.findByMobileNo("8019692761")).thenReturn(nextStepUser);
		assertEquals("arun24", daoService.findByMobileNo("8019692761").getUserId());
	}
}
