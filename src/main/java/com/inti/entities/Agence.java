package com.inti.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

public class Agence {
	private Long idAgence; 
	private String nomAgence; 
	private Adresse adresse;
	
	@OneToOne(mappedBy="agence")
	private ResponsableAgence responsableAgence; 
	
	@OneToMany(mappedBy="agence")
	private Set<Statistique> statistiques = new HashSet<>();
	
	@OneToMany(mappedBy="agence")
	private Set<Vehicule> vehicules = new HashSet<>();
	
	@OneToMany(mappedBy="agence")
	private Set<Offre> offres = new HashSet<>();
	
	
	//Constructeurs
	public Agence() {
	}

	public Agence(String nomAgence, Adresse adresse) {
		this.nomAgence = nomAgence;
		this.adresse = adresse;
	}

	//Getters et setters
	public Long getIdAgence() {
		return idAgence;
	}

	public void setIdAgence(Long idAgence) {
		this.idAgence = idAgence;
	}

	public String getNomAgence() {
		return nomAgence;
	}

	public void setNomAgence(String nomAgence) {
		this.nomAgence = nomAgence;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	// Methode toString
	@Override
	public String toString() {
		return "Agence [idAgence=" + idAgence + ", nomAgence=" + nomAgence + "]";
	}
	
	
}
