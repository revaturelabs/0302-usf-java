package com.example.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.service.s3Service;

@RestController
public class S3Controller {

	@Autowired
	private s3Service ss;
	
	@PostMapping("/s3")
	public String upload(@RequestPart(value="file") MultipartFile file) {
		try {
			return ss.upload(ss.convert(file));
		} catch (IOException e) {
			return "something went wrong with the upload. the reason is: "+e.getMessage();
		}
	}
}
