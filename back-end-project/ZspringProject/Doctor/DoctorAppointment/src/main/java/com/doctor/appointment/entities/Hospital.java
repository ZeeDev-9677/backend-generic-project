package com.doctor.appointment.entities;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.OneToMany;


/**
 * The persistent class for the hospital database table.
 * 
 */
@Entity
@NamedQuery(name="Hospital.findAll", query="SELECT h FROM Hospital h")
public class Hospital implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="hosp_id")
	private Long hospId;

	@Column(name="doct_name")
	private String doctName;

	@Column(name="hosp_address")
	private String hospAddress;

	@Column(name="hosp_name")
	private String hospName;

	@Column(name="pt_age")
	private Integer ptAge;

	@Column(name="pt_mob_no")
	private Long ptMobNo;

	@Column(name="pt_name")
	private String ptName;

	//bi-directional many-to-one association to Patient
	@ManyToOne
	@JoinColumn(name="pt_id")
	private Patient patient;

	//bi-directional many-to-one association to Patient
	@OneToMany(mappedBy="hospital")
	private List<Patient> patients;

	public Hospital() {
	}

	public Long getHospId() {
		return this.hospId;
	}

	public void setHospId(Long hospId) {
		this.hospId = hospId;
	}

	public String getDoctName() {
		return this.doctName;
	}

	public void setDoctName(String doctName) {
		this.doctName = doctName;
	}

	public String getHospAddress() {
		return this.hospAddress;
	}

	public void setHospAddress(String hospAddress) {
		this.hospAddress = hospAddress;
	}

	public String getHospName() {
		return this.hospName;
	}

	public void setHospName(String hospName) {
		this.hospName = hospName;
	}

	public Integer getPtAge() {
		return this.ptAge;
	}

	public void setPtAge(Integer ptAge) {
		this.ptAge = ptAge;
	}

	public Long getPtMobNo() {
		return this.ptMobNo;
	}

	public void setPtMobNo(Long ptMobNo) {
		this.ptMobNo = ptMobNo;
	}

	public String getPtName() {
		return this.ptName;
	}

	public void setPtName(String ptName) {
		this.ptName = ptName;
	}

	public Patient getPatient() {
		return this.patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public List<Patient> getPatients() {
		return this.patients;
	}

	public void setPatients(List<Patient> patients) {
		this.patients = patients;
	}

	public Patient addPatient(Patient patient) {
		getPatients().add(patient);
		patient.setHospital(this);

		return patient;
	}

	public Patient removePatient(Patient patient) {
		getPatients().remove(patient);
		patient.setHospital(null);

		return patient;
	}

}