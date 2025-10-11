package com.patient.services;

import org.springframework.stereotype.Service;

import com.patient.dto.PatientRes;
@Service("AA")
public class PatientServiceImpl2 implements PatientService {

	@Override
	public PatientRes findAll() {
		
		PatientRes p=new PatientRes();
		p.setP_dob("29/02/2002");
		p.setP_name("Dak pro1 AA");
		
		return p;
	}

}
