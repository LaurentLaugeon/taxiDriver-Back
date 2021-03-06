package com.inti.entities;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Vehicule implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idVehicule;
	private String model;
	private String immatriculation; 
	private double conso; 
	private int nbPlace; 
	private double capaciteCoffre;
	
	@OneToOne(mappedBy="vehicule",cascade = CascadeType.ALL)
	@JsonIgnore
	private Chauffeur chauffeur; 
	
	@ManyToOne
	@JoinColumn(name="id_agence")
	private Agence agence;
	
	public Vehicule() {
	}

	public Vehicule(String model, String immatriculation, double conso, int nbPlace, double capaciteCoffre) {
		this.model = model;
		this.immatriculation = immatriculation;
		this.conso = conso;
		this.nbPlace = nbPlace;
		this.capaciteCoffre = capaciteCoffre;
	}

	
	public Vehicule(String model, String immatriculation, double conso, int nbPlace, double capaciteCoffre,
			Chauffeur chauffeur, Agence agence) {
		super();
		this.model = model;
		this.immatriculation = immatriculation;
		this.conso = conso;
		this.nbPlace = nbPlace;
		this.capaciteCoffre = capaciteCoffre;
		this.chauffeur = chauffeur;
		this.agence = agence;
	}

	public Chauffeur getChauffeur() {
		return chauffeur;
	}

	public void setChauffeur(Chauffeur chauffeur) {
		this.chauffeur = chauffeur;
	}

	public Agence getAgence() {
		return agence;
	}

	public void setAgence(Agence agence) {
		this.agence = agence;
	}

	public Long getIdVehicule() {
		return idVehicule;
	}

	public void setIdVehicule(Long idVehicule) {
		this.idVehicule = idVehicule;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getImmatriculation() {
		return immatriculation;
	}

	public void setImmatriculation(String immatriculation) {
		this.immatriculation = immatriculation;
	}

	public double getConso() {
		return conso;
	}

	public void setConso(double conso) {
		this.conso = conso;
	}

	public int getNbPlace() {
		return nbPlace;
	}

	public void setNbPlace(int nbPlace) {
		this.nbPlace = nbPlace;
	}

	public double getCapaciteCoffre() {
		return capaciteCoffre;
	}

	public void setCapaciteCoffre(double capaciteCoffre) {
		this.capaciteCoffre = capaciteCoffre;
	}

	@Override
	public String toString() {
		return "Vehicule [idVehicule=" + idVehicule + ", model=" + model + ", immatriculation=" + immatriculation
				+ ", conso=" + conso + ", nbPlace=" + nbPlace + ", capaciteCoffre=" + capaciteCoffre + "]";
	} 
	
	
}
