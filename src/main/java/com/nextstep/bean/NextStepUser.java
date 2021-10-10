package com.nextstep.bean;

import java.io.Serializable;
import lombok.Data;

@Data
public class NextStepUser implements Serializable {

	private static final long serialVersionUID = -2015499243679468457L;
	
	private String id;
	private String userId;
	private String firstName;
	private String lastName;
	private String mobileNo;
	private String emailId;
	private String password;
	private String city;
	private String state;
	private String Country;
	private String higestEdQualification;
	private String collegeName;
	private String profession;
	
}
