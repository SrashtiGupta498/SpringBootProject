package com.gl.dao;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class EmployeeDao {
	
	public void saveEmployee()
	{
		System.out.println("from the Employee  Dao class");
	
	if(new Random().nextInt(15)<=10)
	{
		throw new RuntimeException("Exception exist in this bussiness logic");
	}
	}

}
