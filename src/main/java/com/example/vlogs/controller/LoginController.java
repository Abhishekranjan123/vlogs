package com.example.vlogs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.vlogs.service.UsersService;
import com.example.vlogs.vo.UsersVo;

@Controller
@RequestMapping("/credential")
public class LoginController {

	
	@Autowired
	private UsersService userService;
	
	@GetMapping("/signin")
	public String signin() {
		return"login";
	}
	
	@GetMapping("/register")
	public String register() {
		return"register";
	}
	
	@PostMapping("/registerUser")
	public String registerUser(@ModelAttribute UsersVo user, Model model) {
		try {
			userService.addUser(user);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return"register";
	}
}
