package com.doctor.appointment.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Docter {
	
	public int id;
	public String name;
	public String gender;
}
