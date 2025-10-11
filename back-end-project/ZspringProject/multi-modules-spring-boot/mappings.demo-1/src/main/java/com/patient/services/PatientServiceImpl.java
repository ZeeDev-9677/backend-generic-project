package com.patient.services;

import org.springframework.stereotype.Service;

import com.patient.dto.PatientRes;
@Service("A")
public class PatientServiceImpl implements PatientService {

	@Override
	public PatientRes findAll() {
		
		PatientRes p=new PatientRes();
		p.setP_dob("29/02/2002");
		p.setP_name("Dak 2 A");
		
		return p;
	}

}
