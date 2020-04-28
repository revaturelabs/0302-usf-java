package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Horror;
import com.example.service.HorrorService;

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
}
