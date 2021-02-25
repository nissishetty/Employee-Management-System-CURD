package com.niswarth.learning.springbootthym.service;

import java.util.List;

import javax.management.RuntimeErrorException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niswarth.learning.springbootthym.model.Employee;
import com.niswarth.learning.springbootthym.repository.EmployeeRepo;


@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepo employeeRepo;

	@Override
	public List<Employee> getAllEmployees() {

		return employeeRepo.findAll();

	}

	@Override
	public void saveEmployee(Employee employee) {
		this.employeeRepo.save(employee);

	}

	@Override
	public Employee getEmployeeById(long id) {
		java.util.Optional<Employee> optional = employeeRepo.findById(id);
		Employee employee = null;
		if (optional.isPresent()) {
			employee = optional.get();

		} else {
			throw new RuntimeException("Employee not found" + id);
		}

		return employee;
	}

	@Override
	public void deleteEmployeeById(long id) {
		this.employeeRepo.deleteById(id);
		
	}

}
