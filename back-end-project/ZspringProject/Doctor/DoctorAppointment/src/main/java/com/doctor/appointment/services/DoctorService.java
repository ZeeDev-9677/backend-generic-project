package com.doctor.appointment.services;

import org.springframework.http.ResponseEntity;

import com.doctor.appointment.dtos.Docter;
import com.doctor.dtos.DoctorReq;

public interface DoctorService {

	public ResponseEntity<String> saveDoctorDtl(DoctorReq doctorReq);

	public Docter getDetails(int id);

}
