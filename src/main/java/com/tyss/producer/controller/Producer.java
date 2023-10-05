package com.tyss.producer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.tyss.producer.service.ProducerService;

@RestController
public class Producer {
	
	@Autowired
	private ProducerService producerService;
	
	@GetMapping("/publish/{message}")
	public String publishMessage(@PathVariable String message) {
		return producerService.publishMessage(message);
	}


}
