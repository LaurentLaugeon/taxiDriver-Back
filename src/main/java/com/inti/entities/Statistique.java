package com.inti.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Statistique implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
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

	public Statistique(String libelle, String valeur, Agence agence) {
		this.libelle = libelle;
		this.valeur = valeur;
		this.agence = agence;
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

	public Agence getAgence() {
		return agence;
	}

	public void setAgence(Agence agence) {
		this.agence = agence;
	}

	// Methode toString
	@Override
	public String toString() {
		return "Statistique [idStatistique=" + idStatistique + ", libelle=" + libelle + ", valeur=" + valeur + "]";
	}
	
	
}
