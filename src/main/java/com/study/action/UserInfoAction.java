package com.study.action;

import java.util.HashMap;
import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.study.entity.UserInfo;

@Controller
public class UserInfoAction {

	@RequestMapping("/hello")
	public String hello(@RequestParam(value = "username") String username) {
		System.out.println("UserInfoAction.hello()");
		System.out.println(username);
		return "success";
	}
	
	@RequestMapping("/aaa")
	public String aa(@Valid UserInfo userInfo,BindingResult result,Model model) {
		System.out.println(userInfo);
		HashMap<String, Object> errorsMap = new HashMap<String, Object>();
		boolean b = result.hasErrors();
		if (b) {
			List<FieldError> list = result.getFieldErrors();
			for (FieldError fieldError : list) {
				System.out.println(fieldError.getField());
				System.out.println(fieldError.getDefaultMessage());
				System.out.println(fieldError);
				errorsMap.put(fieldError.getField(), fieldError.getDefaultMessage());
			}
			model.addAttribute("errorMap", errorsMap);
		}
		
		return "success";
	}
	
	@RequestMapping("/converterTest")
	public String converterTest(@RequestParam("useraaa")UserInfo userInfo) {
		System.out.println(userInfo);
		return "success";
	}
}
