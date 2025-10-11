package com.school.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class CourseRespDto {
	private String crsId;
	private String crsNm;
	private String crsEnroll;
	private String active;
}
