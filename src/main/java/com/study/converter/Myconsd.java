package com.study.converter;

import org.springframework.core.convert.converter.Converter;

import com.study.entity.UserInfo;

public class Myconsd implements Converter<String, UserInfo> {

	@Override
	public UserInfo convert(String source) {
		System.out.println(source);
		UserInfo userInfo = new UserInfo();
		if (source.contains("-")) {
			String[] split = source.split("-");
			userInfo.setId(Integer.parseInt(split[0]));
			userInfo.setName(split[1]);
			userInfo.setGender(split[2]);
		}
		return userInfo;
	}

}
