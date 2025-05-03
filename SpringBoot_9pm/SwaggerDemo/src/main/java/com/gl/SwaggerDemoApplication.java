package com.gl;

import javax.persistence.EntityManager;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.gl.model.Student;


import lombok.extern.slf4j.Slf4j;
@Slf4j
@SpringBootApplication
public class SwaggerDemoApplication implements CommandLineRunner {

	@Autowired
	EntityManager entityManager;
	public static void main(String[] args) {
	}
	@Override
		public void run(String ...args) throws Exception{
		SpringApplication.run(SwaggerDemoApplication.class, args);
		Student student = entityManager.find(Student.class,1L);
//		log.info("Student->{}",student);
//		log.info("Get Passport from Student ->{}",student.getPassport());
		
		log.info("Student -> {}", student);
		log.info("Get Passport from Student -> {}", student.getPassport());
		
//		//when passport is the owning side of the relationship
//		Passport passport = entityManager.find(Passport.class, 1L);
//		log.info("Passport -> {}", passport);
//		log.info("Get Student from Passport  -> {}", passport.getStudent());
	}

}
