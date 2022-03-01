package com.inti.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.inti.model.Adresse;

@Entity
public class Agence implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idAgence; 
	private String nomAgence; 
	@Embedded
	private Adresse adresse;
	
	@OneToOne(mappedBy="agence")
	private ResponsableAgence responsableAgence; 
	
	@OneToMany(mappedBy="agence")
	@JsonIgnore
	private Set<Statistique> statistiques = new HashSet<>();
	
	@OneToMany(mappedBy="agence")
	@JsonIgnore
	private Set<Vehicule> vehicules = new HashSet<>();
	
	@OneToMany(mappedBy="agence")
	@JsonIgnore
	private Set<Offre> offres = new HashSet<>();
	
	
	//Constructeurs
	public Agence() {
	}

	public Agence(String nomAgence, Adresse adresse) {
		this.nomAgence = nomAgence;
		this.adresse = adresse;
	}

	public Agence(String nomAgence, Adresse adresse, ResponsableAgence responsableAgence,
			Set<Statistique> statistiques) {
		this.nomAgence = nomAgence;
		this.adresse = adresse;
		this.responsableAgence = responsableAgence;
		this.statistiques = statistiques;
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

	public ResponsableAgence getResponsableAgence() {
		return responsableAgence;
	}

	public void setResponsableAgence(ResponsableAgence responsableAgence) {
		this.responsableAgence = responsableAgence;
	}

	public Set<Statistique> getStatistiques() {
		return statistiques;
	}

	public void setStatistiques(Set<Statistique> statistiques) {
		this.statistiques = statistiques;
	}

	public Set<Vehicule> getVehicules() {
		return vehicules;
	}

	public void setVehicules(Set<Vehicule> vehicules) {
		this.vehicules = vehicules;
	}

	public Set<Offre> getOffres() {
		return offres;
	}

	public void setOffres(Set<Offre> offres) {
		this.offres = offres;
	}

	// Methode toString
	@Override
	public String toString() {
		return "Agence [idAgence=" + idAgence + ", nomAgence=" + nomAgence + "]";
	}
	
	
}
