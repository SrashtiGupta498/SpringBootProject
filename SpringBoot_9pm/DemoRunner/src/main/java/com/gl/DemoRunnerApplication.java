package com.gl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoRunnerApplication  {

	public static void main(String[] args) {
		SpringApplication.run(DemoRunnerApplication.class, args);
		System.out.println("welcome to command line runner");
	}

} 
