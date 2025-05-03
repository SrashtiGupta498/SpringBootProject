package com.greatlearning.model;

public class Contact {
	@Override
	public String toString() {
		return "Contact [contactid=" + contactid + ", email=" + email + ", contactname=" + contactname + ", userid="
				+ userid + "]";
	}
	private int contactid;
	private String email;
	private String contactname;
	private Long userid;
	
	public int getContactid()
	{
		return contactid;
	}
	public void setContactid(int contactn)
	{
		this.contactid =contactn;
	}
	
	public Contact(int contactid, String email, String contactname, Long userid) {
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
	public Long getUserid() {
		return userid;
	}
	public void setUserid(Long userid) {
		this.userid = userid;
	}
	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
