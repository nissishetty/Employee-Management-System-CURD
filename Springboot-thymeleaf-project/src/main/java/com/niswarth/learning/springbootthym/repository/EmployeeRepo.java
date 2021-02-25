package com.niswarth.learning.springbootthym.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.niswarth.learning.springbootthym.model.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Long>{

	
}
