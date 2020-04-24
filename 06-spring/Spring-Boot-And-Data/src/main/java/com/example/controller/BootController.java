package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Boot;
import com.example.service.BootService;
import com.example.service.UserService;
/**
 * 
 * @author Revature
 *
 *the @RestController annotation is another stereotype. It assumes that it is
 *		a controller inside a RESTful api. Therefore everything returned is 
 *		be default going into a response body.
 *
 *		RESTful API
 *			REpresentational State Transfer
 *
 *		there are 6 constraints with rest
 *			Uniform Interface
 *				/boot -> get should retrieve, delete should delete, post should insert or update, etc.
 *			client server separation
 *				there is a separation between client and server, the should evolve separately
 *			stateless
 *				the server should see each request as if it is all coming from somewhere different
 *			cacheable
 *				should be able to hold a cached version of the data
 *			layered system
 *				the client should not know about the layers in your system
 *			code on demand (optional)
 *				you are free to send back executable code.
 *
 *		rest api
 *			uses http & https
 *			can send back any file format in the body of the response
 *			has 6 constraints to follow for formality
 *
 *
 */
@RestController
@RequestMapping("/boot")
public class BootController {
	
	@Autowired
	BootService boots;
	@Autowired
	UserService us;
	
	@GetMapping
	public Boot getBoot(@RequestHeader("user") String user) {
		String[] usercreds = user.split(",");
		return us.authorize(usercreds[0], usercreds[1])? boots.getBoot():new Boot();
	}
	
	
	

}
