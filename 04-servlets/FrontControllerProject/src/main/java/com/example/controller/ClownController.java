package com.example.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.model.Clown;
import com.example.service.ClownService;

public class ClownController {

	private ClownService cs;
	
	public ClownController() {
		cs = new ClownService();
	}
	
	public void getById(HttpServletRequest req, HttpServletResponse res) {
		int id = Integer.parseInt(req.getParameter("clownId"));
		Clown c = cs.findById(id);
		//we will come back and use an api to convert the object into json and xml
	}
}
