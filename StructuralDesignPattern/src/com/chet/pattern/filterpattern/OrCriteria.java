package com.chet.pattern.filterpattern;

import java.util.List;

public class OrCriteria implements Criteria {

	private Criteria criteria;
	private Criteria otherCriteria;
	
	
	public OrCriteria(Criteria criteria, Criteria otherCriteria) {
		super();
		this.criteria = criteria;
		this.otherCriteria = otherCriteria;
	}


	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> firstCriteriaPersons = this.criteria.meetCriteria(persons);
		List<Person> otherCriteriaPersons = this.otherCriteria.meetCriteria(persons);
		
		for(Person person :otherCriteriaPersons) {
			if(!firstCriteriaPersons.contains(person)) {
				firstCriteriaPersons.add(person);
			}
		}
		return firstCriteriaPersons;
	}

}
