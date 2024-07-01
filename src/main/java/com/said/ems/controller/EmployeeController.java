package com.said.ems.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.said.ems.dto.EmployeeDto;
import com.said.ems.service.EmployeeService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
	
	private EmployeeService employeeService;
	
	// Create
	@PostMapping
	public ResponseEntity<EmployeeDto> createEmployee(@RequestBody EmployeeDto employeeDto)
	{
		EmployeeDto savedEmployee = employeeService.createEmployee(employeeDto);
		return new ResponseEntity<>(savedEmployee, HttpStatus.CREATED);
	}
	
	// Read
	@GetMapping("{id}")
	public ResponseEntity<EmployeeDto> getEmployeeBydId(@PathVariable("id") Long employeeId){
		EmployeeDto employeeDto = employeeService.getEmployeeById(employeeId);
		return ResponseEntity.ok(employeeDto); //return 200
	}
	
	// Read All
	@GetMapping
	public ResponseEntity<List<EmployeeDto>> getAllEmployees(){
		List<EmployeeDto> employees = employeeService.getAllEmployees();
		return ResponseEntity.ok(employees);
	}
	
	// Update
	@PutMapping("{id}")
	public ResponseEntity<EmployeeDto> updateEmployee(@PathVariable("id") Long employeeId,@RequestBody EmployeeDto updatedEmployee){
		EmployeeDto employeeDto = employeeService.updateEmployee(employeeId, updatedEmployee);
		
		return ResponseEntity.ok(employeeDto);
		
	}
	

}
