package com.doctor.appointment.entities;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;


/**
 * The persistent class for the doctor database table.
 * 
 */
@Entity
//@Table(name = "doctor")
@NamedQuery(name="Doctor.findAll", query="SELECT d FROM Doctor d")
public class Doctor implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="doct_id", unique = true, nullable = false)
	private Long doctId;

	@Column(name="doct_mob_no")
	private Long doctMobNo;

	@Column(name="doct_name",length = 200)
	private String doctName;

	@Column(name="doct_spl_in",length = 255)
	private String doctSplIn;

	public Doctor() {
	}

	public Long getDoctId() {
		return this.doctId;
	}

	public void setDoctId(Long doctId) {
		this.doctId = doctId;
	}

	public Long getDoctMobNo() {
		return this.doctMobNo;
	}

	public void setDoctMobNo(Long doctMobNo) {
		this.doctMobNo = doctMobNo;
	}

	public String getDoctName() {
		return this.doctName;
	}

	public void setDoctName(String doctName) {
		this.doctName = doctName;
	}

	public String getDoctSplIn() {
		return this.doctSplIn;
	}

	public void setDoctSplIn(String doctSplIn) {
		this.doctSplIn = doctSplIn;
	}

}