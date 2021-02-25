package com.niswarth.learning.springbootthym.service;

import java.util.List;

import com.niswarth.learning.springbootthym.model.Employee;

public interface EmployeeService {
	List<Employee> getAllEmployees();
	void saveEmployee(Employee employee);
	Employee getEmployeeById(long id);
	void deleteEmployeeById(long id);

}
