package com.bridgelabz.greetingapplicationservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bridgelabz.greetingapplicationservice.model.Greeting;
import com.bridgelabz.greetingapplicationservice.model.User;
import com.bridgelabz.greetingapplicationservice.repository.GreetingAppRepository;

@Service
public class GreetingService {
	private static String template="Hello %s";
	
	@Autowired
	GreetingAppRepository repo;
	
	public String getMessage() {
		return "Hello World";
	}
	public String getGreetingMessage(String fName, String lName) {
		return "Hello "+fName+""+lName;
	}
	public String postMessage(User user) {
		return "Hello "+user.getfName()+""+user.getlName();
	}
	public Greeting saveMessage(Greeting greeting) {
		Greeting newGreeting=new Greeting(String.format(template,greeting.getContent()));
		repo.save(newGreeting);
		return newGreeting;
	}
}
