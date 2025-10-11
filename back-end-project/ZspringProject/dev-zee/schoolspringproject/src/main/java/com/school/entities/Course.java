package com.school.entities;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.NamedQuery;

/**
 * The persistent class for the course database table.
 * 
 */
@Entity
@NamedQuery(name = "Course.findAll", query = "SELECT c FROM Course c")
public class Course implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "crs_id", unique = true, nullable = false)
	private Integer crsId;

	@Column(name = "crs_fee")
	private Integer crsFee;

	@Column(name = "crs_name")
	private String crsName;

	// bi-directional many-to-one association to Student
	@ManyToOne
	@JoinColumn(name = "stud_id")
	private Student student;

	public Course() {
	}

	public Integer getCrsId() {
		return this.crsId;
	}

	public void setCrsId(Integer crsId) {
		this.crsId = crsId;
	}

	public Integer getCrsFee() {
		return this.crsFee;
	}

	public void setCrsFee(Integer crsFee) {
		this.crsFee = crsFee;
	}

	public String getCrsName() {
		return this.crsName;
	}

	public void setCrsName(String crsName) {
		this.crsName = crsName;
	}

	public Student getStudent() {
		return this.student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "Course [crsId=" + crsId + ", crsFee=" + crsFee + ", crsName=" + crsName + ", student=" + student + "]";
	}

}