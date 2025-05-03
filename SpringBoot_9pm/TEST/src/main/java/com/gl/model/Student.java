package com.gl.model;

public class Student {
	Adress d;
//	public Student()
//	{
//		//d= new Adress();
//		System.out.println("this is emp1");
//	}
	
	public void setd(Adress d)
	{
		this.d =d;
	}
	public Student(Adress d)
	{
		this.d =d;
		System.out.println("this is emp1");
	}
	

}
