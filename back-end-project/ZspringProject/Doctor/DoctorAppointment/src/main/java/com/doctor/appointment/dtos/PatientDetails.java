package com.doctor.appointment.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PatientDetails {
	
	private String patientName;
	private String doctName;
	private String doctSpelIn;
	private String hospName;

}
