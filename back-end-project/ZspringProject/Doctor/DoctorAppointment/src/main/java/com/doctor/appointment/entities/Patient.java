package com.doctor.appointment.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;


/**
 * The persistent class for the patient database table.
 * 
 */
@Entity
@NamedQuery(name="Patient.findAll", query="SELECT p FROM Patient p")
public class Patient implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="pt_id")
	private Long ptId;

	@Column(name="pt_address")
	private String ptAddress;

	@Column(name="pt_age")
	private Integer ptAge;

	@Column(name="pt_disease")
	private String ptDisease;

	@Column(name="pt_doct_name")
	private String ptDoctName;

	@Column(name="pt_gender")
	private String ptGender;

	@Column(name="pt_hosp_name")
	private String ptHospName;

	@Column(name="pt_mob_no")
	private String ptMobNo;

	@Column(name="pt_name")
	private String ptName;

	@Temporal(TemporalType.DATE)
	@Column(name="pt_vist_date")
	private Date ptVistDate;

	//bi-directional many-to-one association to Hospital
	@OneToMany(mappedBy="patient")
	private List<Hospital> hospitals;

	//bi-directional many-to-one association to Hospital
	@ManyToOne
	@JoinColumn(name="hosp_id")
	private Hospital hospital;

	public Patient() {
	}

	public Long getPtId() {
		return this.ptId;
	}

	public void setPtId(Long ptId) {
		this.ptId = ptId;
	}

	public String getPtAddress() {
		return this.ptAddress;
	}

	public void setPtAddress(String ptAddress) {
		this.ptAddress = ptAddress;
	}

	public Integer getPtAge() {
		return this.ptAge;
	}

	public void setPtAge(Integer ptAge) {
		this.ptAge = ptAge;
	}

	public String getPtDisease() {
		return this.ptDisease;
	}

	public void setPtDisease(String ptDisease) {
		this.ptDisease = ptDisease;
	}

	public String getPtDoctName() {
		return this.ptDoctName;
	}

	public void setPtDoctName(String ptDoctName) {
		this.ptDoctName = ptDoctName;
	}

	public String getPtGender() {
		return this.ptGender;
	}

	public void setPtGender(String ptGender) {
		this.ptGender = ptGender;
	}

	public String getPtHospName() {
		return this.ptHospName;
	}

	public void setPtHospName(String ptHospName) {
		this.ptHospName = ptHospName;
	}

	public String getPtMobNo() {
		return this.ptMobNo;
	}

	public void setPtMobNo(String ptMobNo) {
		this.ptMobNo = ptMobNo;
	}

	public String getPtName() {
		return this.ptName;
	}

	public void setPtName(String ptName) {
		this.ptName = ptName;
	}

	public Date getPtVistDate() {
		return this.ptVistDate;
	}

	public void setPtVistDate(Date ptVistDate) {
		this.ptVistDate = ptVistDate;
	}

	public List<Hospital> getHospitals() {
		return this.hospitals;
	}

	public void setHospitals(List<Hospital> hospitals) {
		this.hospitals = hospitals;
	}

	public Hospital addHospital(Hospital hospital) {
		getHospitals().add(hospital);
		hospital.setPatient(this);

		return hospital;
	}

	public Hospital removeHospital(Hospital hospital) {
		getHospitals().remove(hospital);
		hospital.setPatient(null);

		return hospital;
	}

	public Hospital getHospital() {
		return this.hospital;
	}

	public void setHospital(Hospital hospital) {
		this.hospital = hospital;
	}

}