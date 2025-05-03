package com.greatlearning.Assesment_1;

/**
 * Hello world!
 *
 */

import java.util.Scanner;


import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.greatlearning.dao.usersdao;
import com.greatlearning.entity.User;


/**
 * Hello world!
 *
 */
public class App 
{
	
    public static void main( String[] args )
    {
   	ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
       
    	Scanner sc = new Scanner(System.in);
		System.out.println("Enter email id");
		String s = sc.next();
		System.out.println("Enter Password");
		String p = sc.next();
	//	ApplicationContext context = new ClassPathXmlApplicationContext("com/greatlearning/Assesment_1/config.xml");
	
		usersdao userdao=context.getBean("userdao",usersdao.class);
		//insert query
		User user = new User();
		user.setEmailid(s);
		user.setPassword(p);
		
		int result =userdao.Userinfo(user);
		System.out.println(result);
    	
    }
}