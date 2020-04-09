package com.controller;

import javax.servlet.http.HttpServletRequest;

public class LandingController {

	public static String goHome() {
		return "html/landing.html";
	}
	
//	public static String login(HttpServletRequest req) {
//		String username = req.getParameter("username");
//		String password = req.getParameter("password");
//		SomeServiceClass ss = new SomeServiceClass();
//		User u = ss.checkCreds(username, password);
//		if(u != null) {
//			return "html/homepage.html";
//		} else {
//			return "html/failedLogin.html";
//		}
//	}
}
