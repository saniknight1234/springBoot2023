package com.sani.cubic.MySpringBoot02.dao;

import java.security.PublicKey;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.sani.cubic.MySpringBoot02.dto.CustomerSignup;

@Repository
public class SignupDaoImple implements SignupDao{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	@Override
	public void deleteById(int sid) {
		String sql = "delete from signup_tbl where sid = "+sid;
		jdbcTemplate.update(sql);
	}
	@Override
	public List<CustomerSignup> findAll(){
		//Code to fetch data from dataBase
		String sql = "select sid, username, password, email, mobile, image, gender, address from signup_tbl";
		List<CustomerSignup> signup = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(CustomerSignup.class));
		
		return signup;
	}
	
	@Override
	public void save(CustomerSignup signup) {
		//Pushing the Data that we from the form to the Data Base table.
		String sql = "insert into signup_tbl(username, password, email, mobile, image, gender, address)" +"values(?,?,?,?,?,?,?)";
		jdbcTemplate.update(sql, new Object[] {signup.getUsername(), signup.getPassword(), signup.getEmail(),signup.getMobile(), signup.getImage(), signup.getGender(), signup.getAddress()});
		
	}
	
	@Override
	public CustomerSignup findById(int sid){
				String sql = "select sid, username, password, email, mobile, image, gender, address from signup_tbl where sid = ?";
				List<CustomerSignup> signup = jdbcTemplate.query(sql,
				new BeanPropertyRowMapper<>(CustomerSignup.class), new Object[] {sid});
		
		return signup.get(0);
	}
	
	
	@Override
	public void editImage(int sid, String newimage){
				//code to edit image in the data base
				String sql = "update signup_tbl set image =? where sid = ?";
				jdbcTemplate.update(sql, new Object[] {newimage,sid});
				
		}
	
	@Override
	public CustomerSignup findByUserNameAndPassword(String username, String password){
				String sql = "select sid, username, password, email, mobile, image, gender, address from signup_tbl where username = ? and password = ?";
				List<CustomerSignup> signup = jdbcTemplate.query(sql,
				new BeanPropertyRowMapper<>(CustomerSignup.class), new Object[] {username, password});
		
		return signup.size()>0 ? signup.get(0) : null;
	}
	
	@Override
	public CustomerSignup findLogedInUser(CustomerSignup username, CustomerSignup password){
				String sql = "select sid, username, password, email, mobile, image, gender, address from signup_tbl where username = ? and password = ?";
				List<CustomerSignup> signup = jdbcTemplate.query(sql,
				new BeanPropertyRowMapper<>(CustomerSignup.class), new Object[] {username.getUsername(), password.getPassword()});
		
		return signup.size()>0 ? signup.get(0) : null;
	}
	/*
	*
	*Created By Abdul Sani Khusravi On Jan 8, 2023  5:12:44 PM
	*/}
