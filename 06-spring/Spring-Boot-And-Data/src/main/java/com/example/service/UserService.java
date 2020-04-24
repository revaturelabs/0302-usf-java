package com.example.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class UserService {

	Map<String, String> cred = new HashMap<>();
	
	{
		cred.put("charlie", "blockhead");
		cred.put("theo", "incredible");
		cred.put("arnold", "football head");
	}
	
	public boolean authorize(String username, String password) {
		return cred.get(username).equals(password);
	}
}


