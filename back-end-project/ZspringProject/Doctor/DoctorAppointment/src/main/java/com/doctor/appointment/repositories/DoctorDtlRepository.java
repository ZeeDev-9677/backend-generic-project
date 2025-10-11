package com.doctor.appointment.repositories;

import java.math.BigInteger;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.doctor.appointment.entities.Doctor;

@Repository
public interface DoctorDtlRepository extends JpaRepository<Doctor,Long> {

}
