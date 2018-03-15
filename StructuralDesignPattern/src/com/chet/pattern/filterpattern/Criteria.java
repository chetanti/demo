package com.chet.pattern.filterpattern;

import java.util.List;

public interface Criteria {

	public List<Person> meetCriteria(List<Person> persons);
}
