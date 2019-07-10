package com.wordpython.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
//@EnableAutoConfiguration
public class UserController {
	@RequestMapping("/user")
	@ResponseBody
	public String home() {
		return "welcome to springboot";
	}
	/*
	 * 跳转到jsp页面
	 */
	@GetMapping("/textjsp")
	public String textJsp() {
		System.out.println("lasdkaslkJsp");
		return "textjsp";
	}
}
