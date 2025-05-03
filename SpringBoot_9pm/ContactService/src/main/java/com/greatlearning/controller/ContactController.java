package com.greatlearning.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

import com.greatlearning.model.Contact;
import com.greatlearning.service.ContactService;

@RestController
@RequestMapping("/contacts")
public class ContactController {

	@Autowired
	private ContactService contactservice;
	
	@GetMapping("/user{userid}")
	public List<Contact>getContactUser(@PathVariable("userid")Long id)
	{
		return this.contactservice.getContactUser(id);
		
	}
}
