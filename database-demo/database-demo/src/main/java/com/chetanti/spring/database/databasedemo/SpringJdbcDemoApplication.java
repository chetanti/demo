package com.chetanti.spring.database.databasedemo;



import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.chetanti.spring.database.databasedemo.entity.Person;
import com.chetanti.spring.database.databasedemo.jdbc.PersonJbdcDao;

//@SpringBootApplication
public class SpringJdbcDemoApplication implements CommandLineRunner{

	@Autowired
	PersonJbdcDao personJdbcDao;
			
	private Logger logger = LoggerFactory.getLogger(this.getClass());
			
	public static void main(String[] args) {
		SpringApplication.run(SpringJdbcDemoApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		logger.info("All Persons : {} " , personJdbcDao.findAll());
		logger.info("Find by Personid : {} " , personJdbcDao.findById(10001));
		logger.info("Find by Person name : {} " , personJdbcDao.findByName("Ranga"));
		
		logger.info("deleteById : {} " , personJdbcDao.deleteById(10002));
		
		logger.info("insert person : {} " , personJdbcDao.insert(new Person(10004,"chetanti","INDIA",new Date())));
		
		logger.info("update person : {} " , personJdbcDao.update(new Person(10004,"chetanti","bangalore",new Date())));
		
		logger.info("Find by Person name : {} " , personJdbcDao.findByName("chetanti"));
	}
	
}
