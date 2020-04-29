package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.model.Horror;
import com.example.service.HorrorService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
@RequestMapping("/horror")
public class HorrorController {

	@Autowired
	HorrorService hs;
	
	@PostMapping
	public Horror insert(@RequestBody Horror h) {
		return hs.insert(h);
	}
	
	@GetMapping
	public List<Horror> List() {
		return hs.findAll();
	}
	
	@GetMapping("stringy")
	@HystrixCommand(fallbackMethod = "fallback")
	public String callScifi() {
		RestTemplate rt = new RestTemplate();
		return rt.getForObject("http://localhost:9888/scifi/stringy", String.class);
		
	}
	
	private String fallback() {
		return "this is not currently available";
	}
}
