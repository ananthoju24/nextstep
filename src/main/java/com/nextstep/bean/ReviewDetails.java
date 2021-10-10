package com.nextstep.bean;

import java.io.Serializable;

import lombok.Data;

@Data
public class ReviewDetails implements Serializable {
 
	private static final long serialVersionUID = 6731489181012951054L;
	private String id;
	private String collegeId;
	private String userId;
	private String review;
	private float rating;
}
