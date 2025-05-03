package com.greatlearning.service;
import java.util.*;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.greatlearning.model.Contact;

@Service
public class ContactServiceImpl implements ContactService{



	@Override
	public List<Contact> getContactUser(Long id) {
		// TODO Auto-generated method stub
		List<Contact>lists = List.of( new Contact(1,"shreya@gmail.com","SHREYA",101l),
				new Contact(2,"Srashti@gmail.com","Srashti",102l));
				return lists.stream().filter((contact)->contact.getUserid().equals(id)).collect(Collectors.toList());


	}
}
