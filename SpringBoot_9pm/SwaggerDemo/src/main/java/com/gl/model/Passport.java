package com.gl.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table (name ="Passport")
@Data
public class Passport {
	@Id
	private Long Passportid;
	@Column
	private String City;
	
	@OneToOne(mappedBy ="passportid",fetch =FetchType.LAZY )
	private Student student;

	@Override
	public String toString() {
		return "Passport [Passportid=" + Passportid + ", City=" + City + ", student=" + student + "]";
	}
	

}
