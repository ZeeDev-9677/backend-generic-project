package com.school.dtos;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class StudentCourseReq {
//	private String studId;
//	private String active;
	private String studName;
	private String studAge;
	private List<CourseDto> courses;
}
