package com.gl.runner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.gl.dao.EmployeeDao;
@Component
public class Testrunner implements CommandLineRunner {
	@Autowired
	private EmployeeDao dao;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		dao.saveEmployee();
		System.out.println("command line runner");
	}

}

 