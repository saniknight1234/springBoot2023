package com.sani.cubic.MySpringBoot02.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sani.cubic.MySpringBoot02.dao.SignupDao;
import com.sani.cubic.MySpringBoot02.dto.CustomerSignup;

@Controller
public class MyApplicationContrller {
	
	@Autowired
	private SignupDao signupDao;
	
	@GetMapping("/")
	public String customerHomePage() {
		
		return "customer-home-page";
	}
	
	
	@GetMapping("/signup")
	public String signupPage(){
		
		return "sign-up-page";
	}
	
	@PostMapping("/signup01")
	public String insertSignupData(@ModelAttribute CustomerSignup signup, Model model){	
			
			signupDao.save(signup);
			
			return "redirect:/showAllData";
	/*
	*
	*Created By Abdul Sani Khusravi On Jan 2, 2023  6:54:49 PM
	*/}
	
	@GetMapping("/showAllData")
	public String showAllData(Model model){	
		List<CustomerSignup> signup = signupDao.findAll();
		model.addAttribute("sData", signup);
		return "signups";
		

	/*
	*
	*Created By Abdul Sani Khusravi On Jan 2, 2023  6:54:49 PM
	*/}
	//DELETE FROM Customers WHERE CustomerName='Alfreds Futterkiste';
	//"delete?username=
	@GetMapping("/deleteUser")
	public String deleteUser(@RequestParam int sid){	
			//Code to delete a user by username from dataBase
		signupDao.deleteById(sid);
		return "redirect:/showAllData";
		

	/*
	*
	*Created By Abdul Sani Khusravi On Jan 2, 2023  6:54:49 PM
	*/}
	@GetMapping("/editImage")
	public String editProfileImage(@RequestParam int sid, Model model){	
			
		CustomerSignup signup = signupDao.findById(sid);
		model.addAttribute("sData", signup);
		return "edit-signup";
			
	}
	
	
	@PostMapping("/updateImage")
	public String updateImage(@RequestParam int sid, @RequestParam String newimage){	
			
		signupDao.editImage(sid, newimage);
		
		return "redirect:/showAllData";
			
	}
	
	

}
