package com.nextstep.bean;

import java.io.Serializable;
import lombok.Data;

@Data
public class CollegeDetails implements Serializable {

	private static final long serialVersionUID = -1333716864269555780L;
	
	private String id;
	private String name;
	private String address;
	private String city;
	private String state;
	private String country;
	private String contactNo;
	private float rating;
}
