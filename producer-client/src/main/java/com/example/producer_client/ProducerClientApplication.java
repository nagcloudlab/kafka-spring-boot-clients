package com.example.producer_client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaTemplate;

@SpringBootApplication
public class ProducerClientApplication {

	// kafka template to send messages to kafka
	@Autowired
	KafkaTemplate<String, String> kafkaTemplate;

	public static void main(String[] args) {
		SpringApplication.run(ProducerClientApplication.class, args);
	}

	// method to send message to kafka
	@Bean
	public CommandLineRunner sendMessage() {
		return (args) -> {
			kafkaTemplate.send("test", "Hello from producer client");
		};
	}

}
