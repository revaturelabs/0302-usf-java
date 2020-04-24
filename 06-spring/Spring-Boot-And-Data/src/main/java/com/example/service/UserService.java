package com.example.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class UserService {

	Map<String, User> cred = new HashMap<>();

	{
		cred.put("charlie", new User("charlie", "blockhead", User.roles.CUSTOMER));
		cred.put("theo", new User("theo","incredible",User.roles.EMPLOYEE));
		cred.put("arnold", new User("arnold","football head",User.roles.ADMIN));
	}

	public boolean authorize(String username, String password) {
		User u = cred.get(username);
		if(u==null) {
			return false;
		}
		if(u.getPassword().equals(password)) {
			return (u.getRole().compareTo(User.roles.EMPLOYEE)>-1); 
		}
		return false;
	}
}

class User {
	private String username;
	private String password;
	private roles role;

	public User(String username, String password, roles role) {
		super();
		this.username = username;
		this.password = password;
		this.role = role;
	}

	public roles getRole() {
		return role;
	}

	public void setRole(roles role) {
		this.role = role;
	}

	enum roles {
		CUSTOMER, EMPLOYEE, ADMIN	
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public User(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + ", role=" + role + "]";
	}

}