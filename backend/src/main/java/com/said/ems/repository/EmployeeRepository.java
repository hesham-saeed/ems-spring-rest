package com.said.ems.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.said.ems.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
	

}
