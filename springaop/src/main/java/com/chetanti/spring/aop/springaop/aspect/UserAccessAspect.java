package com.chetanti.spring.aop.springaop.aspect;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class UserAccessAspect {

	private Logger log = LoggerFactory.getLogger(this.getClass());
	
	
	@Before("execution(* com.chetanti.spring.aop.springaop.business.*.*(..))")
	public void before(JoinPoint joinPoint ) {
	
		log.info(" Interceptor method calls - {} ",joinPoint);
	}
}
