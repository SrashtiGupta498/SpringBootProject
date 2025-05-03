package com.greatlearning.model;

public class Contact {
	private int contactid;
	private String email;
	private String contactname;
	private long userid;
	public int getContactid()
	{
		return contactid;
	}
	public void setContactid(int contactn)
	{
		this.contactid =contactn;
	}
	
	public Contact(int contactid, String email, String contactname, long userid) {
		super();
		this.contactid = contactid;
		this.email = email;
		this.contactname = contactname;
		this.userid = userid;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContactname() {
		return contactname;
	}
	public void setContactname(String contactname) {
		this.contactname = contactname;
	}
	public long getUserid() {
		return userid;
	}
	public void setUserid(long userid) {
		this.userid = userid;
	}
	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
