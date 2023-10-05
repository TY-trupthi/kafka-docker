package com.tyss.producer.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {

	@KafkaListener(topics="my_topic", groupId="my_group_id")
	public void consumeMessage(String message) {
		System.out.println("Received " +message);
	}

}
