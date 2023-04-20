package com.groupeisi.schoolejb.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity	
@Table (name="student") // Création de la table appuser dans la base de donnée
public class Student implements Serializable{
	
	@Id // Clé primaire
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column (name="firstname", nullable=false, length=200)
	private String firstname;

	@Column (name="lastname", nullable=false, length=200)
	private String lastname;
	
	@Column (name="birthdate", nullable=false, length=200)
	private String birthdate;
	
	@Column (name="phone", nullable=false, length=40)
	private String phone;
	
	//Relation
	@OneToMany(mappedBy="students")
	private List<Inscription> inscriptions;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public List<Inscription> getInscriptions() {
		return inscriptions;
	}

	public void setInscriptions(List<Inscription> inscriptions) {
		this.inscriptions = inscriptions;
	}

	public Student() {
		super();
	}

	
	
}
