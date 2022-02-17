package com.bridgelabz.greetingapplicationservice.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {
	
	public String getMessage() {
		return "Hello World";
	}
}
