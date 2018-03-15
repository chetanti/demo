package com.chet.pattern.filterpattern;

import java.util.ArrayList;
import java.util.List;

public class CriteriaPatternDemo {

	public static void main(String[] args) {
		List<Person> personList = new ArrayList<Person>();
		
		personList.add(new Person("chetanti", "female","married"));
		personList.add(new Person("nirav", "male","married"));
		personList.add(new Person("tanmay", "male","single"));
		personList.add(new Person("prerna", "female","married"));
		personList.add(new Person("tallin", "male","single"));
		personList.add(new Person("isha", "female","single"));
		
		
		Criteria  maleCriteria = new MaleCriteria();
		Criteria  femaleCriteria = new FemaleCriteria();
		Criteria  statusCriteria = new StatusCriteria();
		Criteria  andCriteria = new AndCriteria(femaleCriteria, statusCriteria);
		Criteria  orCriteria = new OrCriteria(maleCriteria,statusCriteria);
		
		System.out.println(" Males : ");
		printPersons(maleCriteria.meetCriteria(personList));
		
		System.out.println(" Females :");
		printPersons(femaleCriteria.meetCriteria(personList));
		
		System.out.println(" Singles : ");
		printPersons(statusCriteria.meetCriteria(personList));
		
		System.out.println( " Single Females");
		printPersons(andCriteria.meetCriteria(personList));
		
		System.out.println(" Male or Single ");
		printPersons(orCriteria.meetCriteria(personList));
	}

	 public static void printPersons(List<Person> persons){
		   
	      for (Person person : persons) {
	         System.out.println("Person : [ Name : " + person.getName() + ", Gender : " + person.getGender() + ", Marital Status : " + person.getMaritialStatus() + " ]");
	      }
	   } 
}
