package com.tyss.producer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class ProducerService {

	private static final String TOPIC = "my_topic";

	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;

	public String publishMessage(String msg) {
		this.kafkaTemplate.send(TOPIC, msg);
		return "Published";
	}

}
