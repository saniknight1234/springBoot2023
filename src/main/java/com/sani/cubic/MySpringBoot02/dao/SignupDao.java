package com.sani.cubic.MySpringBoot02.dao;

import java.util.List;

import com.sani.cubic.MySpringBoot02.dto.CustomerSignup;

public interface SignupDao {

	public void deleteById(int sid);

	public List<CustomerSignup> findAll();

	public void save(CustomerSignup signup);

	public CustomerSignup findById(int sid);

	public void editImage(int sid, String newimage);

	public	CustomerSignup findByUserNameAndPassword(String username, String password);

	public	CustomerSignup findLogedInUser(CustomerSignup username, CustomerSignup password);

}
