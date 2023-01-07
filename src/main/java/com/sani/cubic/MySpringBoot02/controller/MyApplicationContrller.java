package com.sani.cubic.MySpringBoot02.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;

import com.sani.cubic.MySpringBoot02.dto.CustomerSignup;
import com.sani.cubic.MySpringBoot02.repo.SignupStore;

@Controller
public class MyApplicationContrller {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
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
			//Pushing the Data that we from the form to the Data Base table.
			String sql = "insert into signup_tbl(username, password, email, mobile, image, gender, address)" +"values(?,?,?,?,?,?,?)";
			jdbcTemplate.update(sql, new Object[] {signup.getUsername(), signup.getPassword(), signup.getEmail(),signup.getMobile(), signup.getImage(), signup.getGender(), signup.getAddress()});
			//creating prepare statement
			
			
			System.out.println("Data is inserted");
			//Code to fetch data from the data base
			
		model.addAttribute("sData", signup);
		model.addAttribute("message","You have signuped successfully !");
		return "redirect:/showAllData";
		

	/*
	*
	*Created By Abdul Sani Khusravi On Jan 2, 2023  6:54:49 PM
	*/}
	@GetMapping("/showAllData")
	public String showAllData(Model model){	
			//Code to fetch data from dataBase
			String sql = "select sid, username, password, email, mobile, image, gender, address from signup_tbl";
			List<CustomerSignup> signup = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(CustomerSignup.class));
			
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
			String sql = "delete from signup_tbl where sid = "+sid;
			jdbcTemplate.update(sql);
			
		
		return "redirect:/showAllData";
		

	/*
	*
	*Created By Abdul Sani Khusravi On Jan 2, 2023  6:54:49 PM
	*/}
	
	@GetMapping("/editImage")
	public String editImage(@RequestParam int sid, Model model){	
			//Code to fetch data from dataBase
			String sql = "select sid, username, password, email, mobile, image, gender, address from signup_tbl where sid = ?";
			List<CustomerSignup> signup = jdbcTemplate.query(sql, new Object[] {sid}, new BeanPropertyRowMapper<>(CustomerSignup.class));
			
		model.addAttribute("sData", signup);
		return "signups";
	}
	

}
