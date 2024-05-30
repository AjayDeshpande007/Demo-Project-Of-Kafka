package com.ajay.kafkademo.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {
	
	
	@KafkaListener(topics = "First_Topic", groupId = "FirstKafkaProject_Group")
	public void listenToTopic(String message) {
		
		System.out.println("The received message is: " + message);
	}

}
