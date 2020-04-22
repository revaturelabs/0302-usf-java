package com.webby.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SimpleController {

	@RequestMapping(method = RequestMethod.GET, value = "/simple.app")
	public ResponseEntity<String> sendSimple() {
		return new ResponseEntity<String>("<h1>this is a simple controller response</h1>",HttpStatus.ACCEPTED);
	}
}
