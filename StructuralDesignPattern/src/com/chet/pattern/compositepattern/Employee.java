package com.chet.pattern.compositepattern;

import java.util.ArrayList;
import java.util.List;

public class Employee {

	private String name;
	private String dept;
	private int salary;
	private List<Employee> subordinates;
	public Employee(String name, String dept, int salary) {
		super();
		this.name = name;
		this.dept = dept;
		this.salary = salary;
		subordinates = new ArrayList<Employee>();
	}
	public void add(Employee emp) {
		subordinates.add(emp);
	}
	public void remove(Employee emp) {
		subordinates.remove(emp);
	}
	public List<Employee> getSubordinates() {
		return subordinates;
	}
	@Override
	public String toString() {
		return String.format("Employee [name=%s, dept=%s, salary=%s]", name, dept, salary,
				subordinates);
	}
	
	
	
	
}
