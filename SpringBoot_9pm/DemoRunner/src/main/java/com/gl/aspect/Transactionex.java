package com.gl.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Transactionex {
	@Pointcut("execution(public void com.gl.dao.EmployeeDao.saveEmployee())")
	public void p1()
	{	
		
	}
	@Before("p1()")
	public void beginTx()
	{
		System.out.println("before Advice");
	}

	@After("p1()")
	public void endTx()
	{
		System.out.println("after advice in aop");
		
	}
//	@AfterReturning("p1()")
//	public void successTx()
//	{
//	System.out.println("this advice printed after success of business Logic");	
//	}
	
	
	@AfterThrowing("p1()")
	public void throwex()
	{
	System.out.println("afterthrowing advice");	
	}

}
