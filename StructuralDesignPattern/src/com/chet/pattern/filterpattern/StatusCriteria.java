package com.chet.pattern.filterpattern;

import java.util.ArrayList;
import java.util.List;

public class StatusCriteria implements Criteria {

	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> singlepersons = new ArrayList<Person>();
		
		for(Person person:persons) {
			if(person.getMaritialStatus().equalsIgnoreCase("SINGLE")) {
				singlepersons.add(person);
			}
		}
		return singlepersons;
	}

}
