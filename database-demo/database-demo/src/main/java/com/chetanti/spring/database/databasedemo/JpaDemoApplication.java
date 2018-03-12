package com.chetanti.spring.database.databasedemo;



import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.chetanti.spring.database.databasedemo.entity.Person;
import com.chetanti.spring.database.databasedemo.jpa.PersonJpaRepository;

@SpringBootApplication
public class JpaDemoApplication implements CommandLineRunner{

	@Autowired
	PersonJpaRepository repository;
			
	private Logger logger = LoggerFactory.getLogger(this.getClass());
			
	public static void main(String[] args) {
		SpringApplication.run(JpaDemoApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		
		logger.info("Find by Personid : {} " , repository.findById(10001));
		logger.info("insert person : " , repository.insert(new Person(1,"chetanti","INDIA",new Date())));
		
		logger.info("update person : {} " , repository.update(new Person("chetanti","bangalore",new Date())));
		
		repository.deleteById(20);
		
		logger.info("All Persons : {} " , repository.findAll());
		
		/*logger.info("Find by Person name : {} " , repository.findByName("Ranga"));
		
		logger.info("deleteById : {} " , repository.deleteById(10002));
		
		logger.info("insert person : {} " , repository.insert(new Person(10004,"chetanti","INDIA",new Date())));
		
		logger.info("update person : {} " , repository.update(new Person(10004,"chetanti","bangalore",new Date())));
		
		logger.info("Find by Person name : {} " , repository.findByName("chetanti"));*/
	}
	
}
