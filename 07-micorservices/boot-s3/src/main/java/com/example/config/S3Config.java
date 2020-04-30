package com.example.config;

import org.springframework.context.annotation.Configuration;

import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;

@Configuration
public class S3Config {

	private String accessKey=System.getenv("AWS_ACCESS_KEY");
	private String secretKey=System.getenv("AWS_SECRET_KEY");
	private AmazonS3 s3;
	private String bucketName="0302-no-answer";
	
	public S3Config() {
		AwsConfig();
	}
	
	private void AwsConfig() {
		s3 = AmazonS3ClientBuilder.standard()
				.withCredentials(new AWSStaticCredentialsProvider(
						new BasicAWSCredentials(accessKey, secretKey)))
				.withRegion(Regions.US_WEST_1)
				.build();
	}
	
	public AmazonS3 getS3() {
		return s3;
	}
	
	public String getBucketName() {
		return bucketName;
	}
	
	
}
