package com.greatlearning.BACKEND_WORK;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan({"com.gl.controller","com.gl.entity","com.gl.repository.ProductRepository","com.gl.serviceImplementation"})

public class BackendWorkApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendWorkApplication.class, args);
		System.out.println("running");
	}

}
