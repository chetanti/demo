package com.chet;

import java.util.ArrayList;
import java.util.List;

/*
 * Method references help to point to methods by their names. A method reference is described using "::" symbol. 
A method reference can be used to point the following types of methods
Static methods
Instance methods
Constructors using new operator (TreeSet::new)
 */
public class MethodReferance {

	
	public static void main(String[] args) {
	
		List<String> names = new ArrayList<String>();
		
	      names.add("Mahesh");
	      names.add("Suresh");
	      names.add("Ramesh");
	      names.add("Naresh");
	      names.add("Kalpesh");
	      
	      names.forEach(System.out::println);
	}
}
