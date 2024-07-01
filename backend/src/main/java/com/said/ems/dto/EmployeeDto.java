package com.said.ems.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
//used for data transfer between client and server(response for REST APIs)
public class EmployeeDto {
	private Long id;
	private String firstName;
	private String lastName;
	private String email;
}
