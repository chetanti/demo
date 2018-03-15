package com.chet.pattern.filterpattern;

public class Person {

	private String name;
	private String gender;
	private String maritialStatus;
	
	
	public Person(String name, String gender, String maritialStatus) {
		super();
		this.name = name;
		this.gender = gender;
		this.maritialStatus = maritialStatus;
	}

	public String getName() {
		return name;
	}
	
	public String getGender() {
		return gender;
	}
	
	public String getMaritialStatus() {
		return maritialStatus;
	}
	
	
	
}
