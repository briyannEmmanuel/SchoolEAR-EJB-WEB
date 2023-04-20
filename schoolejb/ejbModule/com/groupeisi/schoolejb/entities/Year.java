package com.groupeisi.schoolejb.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.groupeisi.schoolejb.entities.Inscription;

@Entity	
@Table (name="year") // Création de la table appuser dans la base de donnée
public class Year implements Serializable{

	@Id // Clé primaire
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column (name="name", nullable=false, length=200)
	private String name;
	
	//Relation
	@OneToMany(mappedBy="years")
	private List<Inscription> inscriptions;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Inscription> getInscriptions() {
		return inscriptions;
	}

	public void setInscriptions(List<Inscription> inscriptions) {
		this.inscriptions = inscriptions;
	}

	public Year(int id, String name, List<Inscription> inscriptions) {
		super();
		this.id = id;
		this.name = name;
		this.inscriptions = inscriptions;
	}

	public Year() {
		super();
	}

	
}
