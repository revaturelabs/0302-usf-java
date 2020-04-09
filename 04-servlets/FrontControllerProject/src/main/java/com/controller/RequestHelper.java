package com.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.controller.ClownController;

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
	
	public static void directProcess(HttpServletRequest req, HttpServletResponse res) {
		switch(req.getRequestURI()) {
		case "/FrontControllerProject/clown.json":
			new ClownController().getById(req, res);
		}
	}
}
