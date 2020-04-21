package com.springy.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.springy.model.User;

@Repository
public class MockDao {
	
	public List<User> getAllUsers(){
		List<User> list = new ArrayList<>();
		list.add(new User(1, "frodo", 33));
		list.add(new User(2, "bilbo", 111));
		list.add(new User(3, "sam", 50));
		return list;
	}

}
