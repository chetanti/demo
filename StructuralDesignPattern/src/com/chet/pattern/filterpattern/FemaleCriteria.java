package com.chet.pattern.filterpattern;

import java.util.ArrayList;
import java.util.List;

public class FemaleCriteria implements Criteria {

	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> femalepersons = new ArrayList<Person>();
		
		for(Person person:persons) {
			if(person.getGender().equalsIgnoreCase("FEMALE")) {
				femalepersons.add(person);
			}
		}
		return femalepersons;
	}

}
