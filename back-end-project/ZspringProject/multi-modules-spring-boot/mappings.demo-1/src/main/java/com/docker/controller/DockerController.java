package com.docker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.patient.dto.PatientRes;
import com.patient.services.PatientService;

import jakarta.servlet.http.HttpServletRequest;



@RestController
public class DockerController {

	@Autowired()
	@Qualifier("A")
	PatientService patientServiceA;
	
	@Autowired()
	@Qualifier("AA")
	PatientService patientServiceAA;
//	@RequestMapping(value="/api/jk", method=RequestMethod.GET)
//	public String syHl() {
//		return "hthtl";
//	}
	
	@RequestMapping(value="/api/zeeA", method=RequestMethod.GET)
	public PatientRes getPatientA(String p_id){
		return patientServiceA.findAll();
		
	}
	
	@RequestMapping(value="/api/zeeAA", method=RequestMethod.GET)
	public PatientRes getPatientAA(String p_id){
		return patientServiceAA.findAll();
		
	}
	
	@RequestMapping(value="/api/zeeAlgo", method=RequestMethod.GET)
	public PatientRes getPatientAAA(@RequestHeader("algo") int algo,HttpServletRequest request){
		if(algo == 1)
		return patientServiceA.findAll();
		else
		return patientServiceAA.findAll();

		
	}
}

