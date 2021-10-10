package com.nextstep.dao.api;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document("review")
public class ReviewDetails implements Serializable {
 
	private static final long serialVersionUID = 6731489181012951054L;
	@Id
	private String id;
	private String collegeId;
	private String userId;
	private String review;
	private float rating;
}
