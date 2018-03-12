package com.chetanti.service;

import org.springframework.stereotype.Service;

import com.chetanti.model.Employee;

@Service
public class EmployeeService {

	public Employee createEmployee(String name, String sempId111111111111111) {

		Employee emp = new Employee();
		emp.setName(name);
		emp.setEmpId(sempId111111111111111);
		return emp;
	}

	public void deleteEmployee(String empId) {
		
	}
}
