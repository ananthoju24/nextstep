package com.nextstep.dao;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document("colege")
public class CollegeDetails implements Serializable {

	private static final long serialVersionUID = -1333716864269555780L;
	
	@Id
	private String id;
	private String collegeName;
	private String address;
	private String city;
	private String state;
	private String country;
	private String contactNo;

}
