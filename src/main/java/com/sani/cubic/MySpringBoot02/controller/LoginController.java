package com.sani.cubic.MySpringBoot02.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sani.cubic.MySpringBoot02.dao.SignupDao;
import com.sani.cubic.MySpringBoot02.dto.CustomerSignup;

@Controller
public class LoginController {
	@Autowired
	private SignupDao signupDao;
	
	@GetMapping("/login")
	public String loginPage(){
		
		return "login";
	}
	
	
	@PostMapping("/login")
	public String loginUser(@RequestParam String username, @RequestParam String password, Model model){	
			
		CustomerSignup signup = signupDao.findByUserNameAndPassword(username, password);
		if(signup !=null) {
			model.addAttribute("sData",signup);
			return "user-login-details";
		}
		model.addAttribute("message", "sorry! your username and password are incorrect!");
		
		return "login";
	}
	
	@GetMapping("/loginDetails")
	public String userLoginDetails(@RequestParam CustomerSignup username, @RequestParam CustomerSignup password, Model model){
		CustomerSignup signup = signupDao.findLogedInUser(username, password);
		model.addAttribute("sData", signup);
		
		return "user-login-details";
	}
	
	/*
	*
	*Created By Abdul Sani Khusravi On Jan 9, 2023  9:07:04 PM
	*/}
