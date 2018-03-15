package com.chet.pattern.filterpattern;

import java.util.List;

public class AndCriteria implements Criteria {

	private Criteria criteria;
	private Criteria otherCriteria;
	
	
	public AndCriteria(Criteria criteria, Criteria otherCriteria) {
		super();
		this.criteria = criteria;
		this.otherCriteria = otherCriteria;
	}


	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> firstCriteriaPersons = this.criteria.meetCriteria(persons);
		
		return this.otherCriteria.meetCriteria(firstCriteriaPersons);
	}

}
