package com.bridgelabz.greetingapplicationservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bridgelabz.greetingapplicationservice.model.Greeting;

public interface GreetingAppRepository extends JpaRepository<Greeting, Integer> {};

