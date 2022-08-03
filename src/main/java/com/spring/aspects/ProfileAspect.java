package com.spring.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.springdata.UsersEntity;

@Aspect
@Component
public class ProfileAspect  {
	
	@Before("within(com.spring.beans.ProfileBean)")
	public void getResponseTime() throws Exception{
		System.out.println(" Entering Aspect - response time performance");
		
	}
	/*
	@Before("pointcut1()")
	public Object advice1(ProceedingJoinPoint  joinPoint){
			.....code....
	}
	@Before("pointcut1()") // apply point cut
	public Object advice1(ProceedingJoinPoint  joinPoint){
			.....code....
	}
	@Pointcut("within(com.spring.beans.ProfileBean)")
	public void pointcut1(){ }
	 */
	
}
