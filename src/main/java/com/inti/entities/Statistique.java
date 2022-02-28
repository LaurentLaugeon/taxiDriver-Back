package com.inti.entities;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class Statistique {
	private Long idStatistique;
	private String libelle; 
	private String valeur; 
	
	@ManyToOne
	@JoinColumn(name="id_agence")
	private Agence agence;
	
	// Constructeurs
	public Statistique() {
	}

	public Statistique(String libelle, String valeur) {
		this.libelle = libelle;
		this.valeur = valeur;
	}

	//Getters et setters
	public Long getIdStatistique() {
		return idStatistique;
	}

	public void setIdStatistique(Long idStatistique) {
		this.idStatistique = idStatistique;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public String getValeur() {
		return valeur;
	}

	public void setValeur(String valeur) {
		this.valeur = valeur;
	}

	// Methode toString
	@Override
	public String toString() {
		return "Statistique [idStatistique=" + idStatistique + ", libelle=" + libelle + ", valeur=" + valeur + "]";
	}
	
	
}
