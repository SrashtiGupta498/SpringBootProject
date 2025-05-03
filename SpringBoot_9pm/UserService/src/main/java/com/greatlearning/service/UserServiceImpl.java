package com.greatlearning.service;

import org.springframework.stereotype.Service;
import java.util.*;
import com.greatlearning.model.user;

@Service
public class UserServiceImpl implements  UserService {

	@Override
	public user getUser(Long id) {
		// TODO Auto-generated method stub
		List<user> list = List.of(
				new user(101l,"srashtiGupta","Srashti123"),
				new user(102l,"Shreya","Shreya123"),
				new user(103l,"vishal","vishal123"));
				
		return list.stream().filter((user)->user.getUserid().equals(id)).findAny().orElse(null);
	}

}
