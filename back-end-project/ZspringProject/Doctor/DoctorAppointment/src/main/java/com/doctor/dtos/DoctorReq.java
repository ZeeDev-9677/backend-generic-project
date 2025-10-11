package com.doctor.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DoctorReq {

//	private String doctId;
	private String doctName;
	private String doctSpelIn;
	private String doctMobNo;

}
