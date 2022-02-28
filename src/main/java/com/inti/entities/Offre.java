package com.inti.entities;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class Offre {
	private Long idOffre; 
	private int nbVoyFree;
	
	@ManyToOne
	@JoinColumn(name="id_agence")
	private Agence agence;
	
	
	// Constructeur 
	public Offre() {
	}

	public Offre(int nbVoyFree) {
		this.nbVoyFree = nbVoyFree;
	}

	// Getters et setters
	public Long getIdOffre() {
		return idOffre;
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

	// Methode toString 
	@Override
	public String toString() {
		return "Offre [idOffre=" + idOffre + ", nbVoyFree=" + nbVoyFree + "]";
	} 
	
	
	
	
}
