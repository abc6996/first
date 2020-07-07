package com.study.entity;

import java.util.Date;

import javax.validation.constraints.Future;

import org.hibernate.validator.constraints.Length;
import org.springframework.format.annotation.DateTimeFormat;

public class UserInfo {
	private Integer id;
	@Length(min = 3,max = 5)
	private String name;
	private String gender;
	@DateTimeFormat(pattern = "yyy-MM-dd")
	@Future
	private Date day;

	public UserInfo() {
	}

	public Date getDay() {
		return day;
	}

	public void setDay(Date day) {
		this.day = day;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	} 

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "UserInfo [id=" + id + ", name=" + name + ", gender=" + gender + ", day=" + day + "]";
	}



}
