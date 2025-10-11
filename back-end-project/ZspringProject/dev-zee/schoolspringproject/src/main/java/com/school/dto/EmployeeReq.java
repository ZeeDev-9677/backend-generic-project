package com.school.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@NoArgsConstructor
@AllArgsConstructor
@Data
public class EmployeeReq{
	
	private long empId;
	private String empName;
	private long empSalary;
	private String empCity;
}

/*
 * use of record in java 17 to reduce lines of code(remove getters,
 * constructors, and toString methods)
 */
//public record EmployeeReq (long empId,String empName, long empSalary,String empCity){}