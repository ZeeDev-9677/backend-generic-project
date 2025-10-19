package com.doctor.appointment.services;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.doctor.appointment.dtos.Docter;
import com.doctor.appointment.entities.Doctor;
import com.doctor.appointment.repositories.DoctorDtlRepository;
import com.doctor.dtos.DoctorReq;

//@Slf4j
@Service
public class DoctorServiceImpl implements DoctorService {

	@Autowired
	DoctorDtlRepository doctorDtlRepository;

//	private final CourseDao courseDao;
//	private final StudentDao studentDao;
	ModelMapper modelMapper = new ModelMapper();

//	public CourseServiceImpl(CourseDao courseDao) {
//		this.courseDao = courseDao;
//		/*
//		 * list=new ArrayList<>(); list.add(new
//		 * Course(145,"Java Basics","this is for beginners")); list.add(new
//		 * Course(146,"React Basics","this is for intermediate"));
//		 */
//	}
	@Override
	public ResponseEntity<String> saveDoctorDtl(DoctorReq doctorReq) {
//		ModelMapper modelMapper = new ModelMapper();
//		List<PatientDetails> dctrNames = modelMapper.map(doctName, new TypeToken<List<PatientDetails>>() {
//		}.getType());
//		
//		for(PatientDetails patientDetails:dctrNames) {
//			PatientDetails dName=new PatientDetails();
//			dName.setDoctName(patientDetails.getDoctName());
//			dName.setDoctSpelIn(patientDetails.getHospName());
//		}
//		return null;

		Doctor doctor = modelMapper.map(doctorReq, Doctor.class);
		doctor.setDoctName(doctorReq.getDoctName());
		doctor.setDoctSplIn(doctorReq.getDoctSpelIn());
		doctor.setDoctMobNo(Long.valueOf(doctorReq.getDoctMobNo()));

		this.doctorDtlRepository.save(doctor);
		return new ResponseEntity<String>("Data saved..", HttpStatus.CREATED);
	}

	@Override
	public Docter getDetails(int id) {
		List<Docter> el=Arrays.asList(new Docter(101,"Abdul","Male"),new Docter(102,"Mahi","Female"),new Docter(103,"Tasi","Male"));

		Docter filter = el.stream().filter(x->x.getId()==id).findAny().get();
		return filter;
	}

}
