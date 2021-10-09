package com.nextstep.dao;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document("nextstepusers")
public class NextStepUser implements Serializable {

	private static final long serialVersionUID = -2015499243679468457L;
	
	@Id
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
