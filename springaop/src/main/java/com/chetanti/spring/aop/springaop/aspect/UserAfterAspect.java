package com.chetanti.spring.aop.springaop.aspect;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class UserAfterAspect {

	private Logger log = LoggerFactory.getLogger(this.getClass());
	
	
	@AfterReturning(
			value="execution(* com.chetanti.spring.aop.springaop.business.*.*(..))" ,
			returning = "result")
	public void after(JoinPoint joinPoint,Object result ) {
	
		log.info(" {} returned with value - {} ",joinPoint, result);
	}
	
	@AfterThrowing(
			value="execution(* com.chetanti.spring.aop.springaop.business.*.*(..))" ,
			throwing = "exception")
	public void afterThrowing(JoinPoint joinPoint,Exception exception ) {
	
		log.info(" {} throw Exception - {} ",joinPoint, exception);
	}
	

	@After(
			value="execution(* com.chetanti.spring.aop.springaop.business.*.*(..))" )
	public void after(JoinPoint joinPoint ) {
	
		log.info(" After Execution - {} ",joinPoint);
	}
}
