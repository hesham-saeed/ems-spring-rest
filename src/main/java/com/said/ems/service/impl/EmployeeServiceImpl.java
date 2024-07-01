package com.said.ems.service.impl;

import org.springframework.stereotype.Service;

import com.said.ems.dto.EmployeeDto;
import com.said.ems.entity.Employee;
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

}
