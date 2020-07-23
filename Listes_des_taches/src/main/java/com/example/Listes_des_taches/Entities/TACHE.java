package com.example.Listes_des_taches.Entities;


import java.io.Serializable;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.validation.*;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class TACHE implements Serializable{


	@Id
	   @GeneratedValue(
			    strategy= GenerationType.AUTO,
			    generator="native"
			)
			@GenericGenerator(
			    name = "native",
			    strategy = "native"
			)
		private Long id;
	
	 @NotNull
	   @Size(min=1,max=40)
		private String nom;
	
	   @NotNull
	   @Size(min=1,max=40)
		private String description;
	   
	   
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	   
	
	
}
