package com.example.HackerNewsAPI;

import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import java.util.logging.Logger;

@SpringBootApplication
public class HackerNewsApiApplication {

	private static final Logger log = (Logger) LoggerFactory.getLogger(HackerNewsApiApplication.class);


	public static void main(String[] args) {
		SpringApplication.run(HackerNewsApiApplication.class, args);


	}

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}




}
