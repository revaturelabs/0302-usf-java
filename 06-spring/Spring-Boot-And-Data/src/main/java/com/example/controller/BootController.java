package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Boot;
import com.example.service.BootService;
/**
 * 
 * @author Revature
 *
 *the @RestController annotation is another stereotype. It assumes that it is
 *		a controller inside a RESTful api. Therefore everything returned is 
 *		be default going into a response body.
 */
@RestController
@RequestMapping("/boot")
public class BootController {
	
	@Autowired
	BootService boots;
	
	@GetMapping
	public Boot getBoot() {
		return boots.getBoot();
	}
	

}
