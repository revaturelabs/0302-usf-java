package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.QueueService;

@RestController
@RequestMapping("/message")
public class QueueController {
	
	@Autowired
	private QueueService qs;

	@PostMapping
	public String sendMessage(@RequestBody String message) {
		return qs.sendMessage(message);
	}
	
	@GetMapping
	public String getMessage() {
		return qs.recieveMessage();
	}
}
