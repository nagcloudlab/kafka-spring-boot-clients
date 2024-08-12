package com.example.consumer_client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;

@SpringBootApplication
public class ConsumerClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsumerClientApplication.class, args);
	}

	// consumer method to receive message from kafka
	@KafkaListener(topics = "test", groupId = "group_id")
	public void consume(String message) {
		System.out.println("Consumed message: " + message);
	}

}
