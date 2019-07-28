package com.xs.www.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/login")
public class LoginController {

	@PostMapping(value = "/login")
	public String login(String loginName, String password) {
		return "page/index";
	}

}
