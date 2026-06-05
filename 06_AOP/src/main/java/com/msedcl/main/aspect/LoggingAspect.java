package com.msedcl.main.aspect;

import com.msedcl.main.config.SpringConfiguration;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

//@Component  commented to understand  use java configurATION 
@Aspect
public class LoggingAspect {

	

	@Pointcut("execution (void com.msedcl.main.service.UserService.createUser(String))")
	public void logging() {
	}

	@Around("logging()")
	public void logAround(ProceedingJoinPoint proceedingJintPoint) throws Throwable {
		System.out.println("[Around ] advice called before  method  execution start");
		// cal actual funtion
		proceedingJintPoint.proceed();
		System.out.println("[Around ] advice called after  method  execution complete");
	}

//	@Before("execution (void com.msedcl.main.service.UserService.createUser(String))")
	// @Before("execution (* com.msedcl.main.service.*.*(..))")
	

	@Before("logging()")
	public void logBeforeB(JoinPoint jointPoint) {
		System.out.println("[BeforeB] advice called for method " + jointPoint.getSignature());
	}
	
	@Before("logging()")
	public void logBeforedT(JoinPoint jointPoint) {
		System.out.println("[BeforeT] advice called for method " + jointPoint.getSignature());
	}


	@Before("logging()")
	public void logBeforeA(JoinPoint jointPoint) {
		System.out.println("[Before1] advice called for method " + jointPoint.getSignature());
	}

	// @After("execution (void
	// com.msedcl.main.service.UserService.createUser(String))")
	// @After("execution (* com.msedcl.main.service.*.*(..))")
	@After("logging()")
	public void logAfter() {
		System.out.println("[After] advice called");
	}

}
