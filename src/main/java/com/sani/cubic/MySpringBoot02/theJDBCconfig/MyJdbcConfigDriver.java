package com.sani.cubic.MySpringBoot02.theJDBCconfig;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class MyJdbcConfigDriver {
	
	//This annotation register this object as bean inside spring container
	@Bean
	public DataSource dataSource() {
		
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		//using MySql Data base
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/cubic9001?allowPublicKeyRetrieval=true&useSSL=False"); //Change url
		dataSource.setUsername("root");//My workbench username
		dataSource.setPassword("sani123");//mysql workbench password
		return dataSource;
		
		
	}
	
	@Bean
	public JdbcTemplate creaTemplate() {
		JdbcTemplate jdbcTemplate = new JdbcTemplate(this.dataSource());
		return jdbcTemplate;
	}
	
	/*
	*
	*Created By Abdul Sani Khusravi On Jan 3, 2023  5:41:28 PM
	*/}
