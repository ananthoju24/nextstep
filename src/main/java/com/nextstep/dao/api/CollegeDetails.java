package com.nextstep.dao.api;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document("college")
public class CollegeDetails implements Serializable {

	private static final long serialVersionUID = -1333716864269555780L;
	
	@Id
	private String id;
	private String name;
	private String address;
	private String city;
	private String state;
	private String country;
	private String contactNo;
	private float rating; // Average while storing in db 
}
