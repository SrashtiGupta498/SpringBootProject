package com.greatlearning.controller;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.greatlearning.model.Contact;
import com.greatlearning.model.user;
import com.greatlearning.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
@Autowired
private UserService userservice;
@Autowired
private RestTemplate restTemplate;

@GetMapping("/{userid}")
public user getUser(@PathVariable("userid")Long id)
{
	user user = this.userservice.getUser(id);
	List<Contact> contact= this.restTemplate.getForObject("http://ContactService/contact/user/"+user.getUserid(),List.class);
	user.setContact(contact);
	return user;
}

}
