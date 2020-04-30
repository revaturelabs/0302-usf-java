package com.example.service;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.amazonaws.services.s3.model.CannedAccessControlList;
import com.amazonaws.services.s3.model.PutObjectRequest;
import com.example.config.S3Config;

@Service
public class s3Service {
	
	@Autowired
	private S3Config config;

	public String upload(File file) {
		config.getS3()
			.putObject(new PutObjectRequest(
					config.getBucketName(), file.getName(), file)
					.withCannedAcl(CannedAccessControlList.PublicRead));
		return "http://"+config.getBucketName()+".s3.us-west-1.amazonaws.com/"+file.getName();
	}
	
	public File convert(MultipartFile file) throws IOException {
		File converted = new File(file.getOriginalFilename());
		FileOutputStream fos = new FileOutputStream(converted);
		fos.write(file.getBytes());
		fos.close();
		return converted;
	}
}
