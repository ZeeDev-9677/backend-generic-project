package com.school.entities;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.OneToMany;

/**
 * The persistent class for the student database table.
 * 
 */
@Entity
@NamedQuery(name = "Student.findAll", query = "SELECT s FROM Student s")
public class Student implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "stud_id", unique = true, nullable = false)
	private Integer studId;

	@Column(name = "stud_age")
	private Integer studAge;

	@Column(name = "stud_name")
	private String studName;

	// bi-directional many-to-one association to Course
	@OneToMany(mappedBy = "student", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Course> courses;

	public Student() {
	}

	public Integer getStudId() {
		return this.studId;
	}

	public void setStudId(Integer studId) {
		this.studId = studId;
	}

	public Integer getStudAge() {
		return this.studAge;
	}

	public void setStudAge(Integer studAge) {
		this.studAge = studAge;
	}

	public String getStudName() {
		return this.studName;
	}

	public void setStudName(String studName) {
		this.studName = studName;
	}

	public List<Course> getCourses() {
		return this.courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}

	public Course addCours(Course cours) {
		getCourses().add(cours);
		cours.setStudent(this);

		return cours;
	}

	public Course removeCours(Course cours) {
		getCourses().remove(cours);
		cours.setStudent(null);

		return cours;
	}

	@Override
	public String toString() {
		return "Student [studId=" + studId + ", studAge=" + studAge + ", studName=" + studName + ", courses=" + courses
				+ "]";
	}

}