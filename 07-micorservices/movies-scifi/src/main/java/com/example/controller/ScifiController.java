package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Scifi;
import com.example.service.ScifiService;

@RestController
@RequestMapping("/scifi")
public class ScifiController {
	
	@Value("${message}")
	private String message;
	

	@Autowired
	ScifiService hs;
	
	@PostMapping
	public Scifi insert(@RequestBody Scifi h) {
		return hs.insert(h);
	}
	
	@GetMapping
	public List<Scifi> List() {
		return hs.findAll();
	}
	
	@GetMapping("/stringy")
	public String getSomething() {
		return hs.findAll().get(0).toString();
	}
	
	@GetMapping("/message")
	public String getMessage() {
		return message;
	}
}
