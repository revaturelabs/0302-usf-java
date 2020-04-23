package com.webby.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewResolver {

	@GetMapping("home.app")
	public String goHome() {
//		return "html/index.html";
		return "index";
	}
	
	@GetMapping("next.app")
	public String nextPage() {
//		return "html/next.html";
		return "next";
	}
}
