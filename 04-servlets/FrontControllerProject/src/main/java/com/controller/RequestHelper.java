package com.controller;

import javax.servlet.http.HttpServletRequest;

public class RequestHelper {

	public static String process(HttpServletRequest req) {
		System.out.println(req.getRequestURI());
		switch(req.getRequestURI()) {
		case "/FrontControllerProject/landing.master":
			return LandingController.goHome();
		case "/FrontControllerProject/gonext.master":
			return "html/second.html";
		default:
			return "";
		}
	}
}
