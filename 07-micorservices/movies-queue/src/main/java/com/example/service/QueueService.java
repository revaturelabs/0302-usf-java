package com.example.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.sqs.AmazonSQS;
import com.amazonaws.services.sqs.AmazonSQSClientBuilder;
import com.amazonaws.services.sqs.model.SendMessageRequest;

@Service
public class QueueService {

	private AWSCredentials cred;
	private AmazonSQS sqs;
//	@Value("${AWS_ACCESS_KEY}")
	private String accessKey=System.getenv("AWS_ACCESS_KEY");
//	@Value("${AWS_SECRET_KEY}")
	private String secretKey=System.getenv("AWS_SECRET_KEY");
	private String url="https://sqs.us-west-1.amazonaws.com/967240801169/0302queue";
	
	private void BuildQueue() {
		cred = new BasicAWSCredentials(accessKey, secretKey);
		sqs = AmazonSQSClientBuilder.standard()
				.withCredentials(new AWSStaticCredentialsProvider(cred))
				.withRegion(Regions.US_WEST_1)
				.build();
	}

	public QueueService() {
		BuildQueue();
	}
	
	public String sendMessage(String message) {
		sqs.sendMessage(new SendMessageRequest()
				.withQueueUrl(url)
				.withMessageBody("this is our message "+message));
		return message;
	}
	
	public String recieveMessage() {
		return sqs.receiveMessage(url).getMessages().get(0).getBody();
	}
	
	
}
