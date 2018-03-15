package com.chet.pattern.filterpattern;

import java.util.ArrayList;
import java.util.List;

public class MaleCriteria implements Criteria {

	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> malepersons = new ArrayList<Person>();
		
		for(Person person:persons) {
			if(person.getGender().equalsIgnoreCase("MALE")) {
				malepersons.add(person);
			}
		}
		return malepersons;
	}

}
