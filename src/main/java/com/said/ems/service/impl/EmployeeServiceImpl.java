package com.said.ems.service.impl;

import org.springframework.stereotype.Service;

import com.said.ems.dto.EmployeeDto;
import com.said.ems.entity.Employee;
import com.said.ems.exception.ResourceNotFoundException;
import com.said.ems.mapper.EmployeeMapper;
import com.said.ems.repository.EmployeeRepository;
import com.said.ems.service.EmployeeService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {
	
	private EmployeeRepository employeeRepository;
	
	@Override
	public EmployeeDto createEmployee(EmployeeDto employeeDto) {
		
		Employee employee = EmployeeMapper.mapToEmployee(employeeDto);
		Employee savedEmployee = employeeRepository.save(employee);
		
		return EmployeeMapper.mapToEmployeeDto(savedEmployee);
	}

	
	@Override
	public EmployeeDto getEmployeeById(Long employeeId) {
		
		Employee employee = employeeRepository.findById(employeeId)
			.orElseThrow(() -> 
				new ResourceNotFoundException("Employee doesn't exist with the given ID : " + employeeId));
		
		return EmployeeMapper.mapToEmployeeDto(employee);
	}

}
