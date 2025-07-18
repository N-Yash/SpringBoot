package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;

@RestController
public class MyClientSideController {
	
	@LoadBalanced
	@Bean
	RestTemplate restTeamplate() {
		return new RestTemplate();
	}
	
	@Autowired
	RestTemplate restTemplate;
	
	@GetMapping("/client/frontend")
	public String hello() {
		String randomString = this.restTemplate.getForObject("http://server/backend", String.class);
		return "Server Response:: " + randomString;
	}
}