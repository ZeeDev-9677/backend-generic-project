package com.school.dtos;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class StudentRespDto {
	private String studId;
	private String studName;
	private String studAge;
//	private String active;
//	List<CourseDto> courseList;
}
