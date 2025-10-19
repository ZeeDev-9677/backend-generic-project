package com.doctor.appointment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.doctor.appointment.dtos.Docter;
import com.doctor.appointment.entities.Doctor;
import com.doctor.appointment.services.DoctorService;
import com.doctor.dtos.DoctorReq;

@RestController
@RequestMapping(value = "/v1/api")
public class DoctorController {
	@Autowired
	private DoctorService doctorService;

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ResponseEntity<String> saveDoctorDtl (@RequestBody DoctorReq doctorReq) {
		this.doctorService.saveDoctorDtl(doctorReq);
//		return ResponseEntity.status(HttpStatus.CREATED).body(new ResponseDto(DoctorConstants.STATUS_201,DoctorConstants.MESSAGE_500));
		return new ResponseEntity<String>("Data saved..",HttpStatus.CREATED);
	}
    @RequestMapping(value="/emp/{id}",method=RequestMethod.GET)
	public Docter getDetails(@PathVariable("id") int id) {
		return this.doctorService.getDetails(id);
	}
}
