package com.inti.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Offre implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idOffre; 
	private String libelle;
	private int nbVoyFree;
	
	@ManyToOne
	@JoinColumn(name="id_agence")
	private Agence agence;
	
	
	// Constructeur 
	public Offre() {
	}

	public Offre(String libelle, int nbVoyFree, Agence agence) {
		super();
		this.libelle = libelle;
		this.nbVoyFree = nbVoyFree;
		this.agence = agence;
	}

	public Offre(int nbVoyFree) {
		this.nbVoyFree = nbVoyFree;
	}

	
	public Offre(int nbVoyFree, Agence agence) {
		super();
		this.nbVoyFree = nbVoyFree;
		this.agence = agence;
	}

	// Getters et setters
	
	public Long getIdOffre() {
		return idOffre;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public void setIdOffre(Long idOffre) {
		this.idOffre = idOffre;
	}

	public int getNbVoyFree() {
		return nbVoyFree;
	}

	public void setNbVoyFree(int nbVoyFree) {
		this.nbVoyFree = nbVoyFree;
	}

	public Agence getAgence() {
		return agence;
	}

	public void setAgence(Agence agence) {
		this.agence = agence;
	}

	// Methode toString 
	@Override
	public String toString() {
		return "Offre [idOffre=" + idOffre + ", libelle=" + libelle + ", nbVoyFree=" + nbVoyFree + ", agence=" + agence
				+ "]";
	}
	
	
}
