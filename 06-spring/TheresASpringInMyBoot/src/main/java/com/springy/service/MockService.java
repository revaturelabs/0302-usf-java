package com.springy.service;

import java.util.List;

import com.springy.dao.MockDao;
import com.springy.model.User;

public class MockService {

	MockDao md;
	
	public List<User> getAll(){
		return md.getAllUsers();
	}

	public MockDao getMd() {
		return md;
	}
	
	public void setMd(MockDao md) {
		this.md=md;
		System.out.println("inside the setter");
	}
	
	public MockService() {
		super();
		System.out.println("mock service is being instantiated");
	}
	
	public MockService(MockDao md) {
		super();
		this.md=md;
		System.out.println("all args constructor called");
	}
}
