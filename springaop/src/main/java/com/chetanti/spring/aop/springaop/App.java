package com.chetanti.spring.aop.springaop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.chetanti.spring.aop.springaop.business.Business1;
import com.chetanti.spring.aop.springaop.business.Business2;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class App implements CommandLineRunner
{
	private Logger log = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private Business1 bus1;
	
	@Autowired
	private Business2 bus2;
    public static void main( String[] args )
    {
        SpringApplication.run(App.class, args);
    }

	public void run(String... arg0) throws Exception {
		
		log.info(bus1.calculateSomething());
		
		log.info(bus2.calculateSomething());
	}
}
