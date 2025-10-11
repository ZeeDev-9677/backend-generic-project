package com.doctor.appointment.services;

import org.springframework.http.ResponseEntity;

import com.doctor.dtos.DoctorReq;

public interface DoctorService {

	public ResponseEntity<String> saveDoctorDtl(DoctorReq doctorReq);

}
