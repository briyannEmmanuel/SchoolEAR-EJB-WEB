package com.groupeisi.schoolejb.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.groupeisi.schoolejb.entities.Courses;
import com.groupeisi.schoolejb.entities.Student;
import com.groupeisi.schoolejb.entities.Year;

@Entity	
@Table (name="inscription") // Création de la table appuser dans la base de donnée
public class Inscription implements Serializable{
	
	@Id // Clé primaire
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column (name="details", nullable=false, length=200)
	private String details;

	// Relations 
	
	@ManyToOne
	private Courses courses;
	@ManyToOne
	private Student students;
	@ManyToOne
	private Year years;
	
	public Inscription(int id, String details, Courses courses, Student students, Year years) {
		super();
		this.id = id;
		this.details = details;
		this.courses = courses;
		this.students = students;
		this.years = years;
	}
	public Inscription() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public Courses getCourses() {
		return courses;
	}
	public void setCourses(Courses courses) {
		this.courses = courses;
	}
	public Student getStudents() {
		return students;
	}
	public void setStudents(Student students) {
		this.students = students;
	}
	public Year getYears() {
		return years;
	}
	public void setYears(Year years) {
		this.years = years;
	}
	
	
}
