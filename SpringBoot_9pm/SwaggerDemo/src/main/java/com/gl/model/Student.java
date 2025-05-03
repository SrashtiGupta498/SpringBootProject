package com.gl.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name ="Student")
public class Student {
	
	@Id
	private Long id;
	@Column (nullable = false)
	private String name;
	@OneToOne
	private Passport passports;
	@OneToOne(fetch =FetchType.LAZY)
	private Passport passport;
	
	protected Student()
	{  
		
	}
	public Student(String name)
	{
		this.name =name;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + "]";
	}
	
	

}
