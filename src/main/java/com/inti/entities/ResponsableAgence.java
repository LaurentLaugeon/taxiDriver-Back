package com.inti.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class ResponsableAgence extends Utilisateur implements Serializable{
	@OneToOne(mappedBy = "responsableAgence")
	@JoinColumn(name = "id_agence")
	private Agence agence;

	public ResponsableAgence() {
		super();
	}

	public ResponsableAgence(Agence agence) {
		super();
		this.agence = agence;
	}

	public Agence getAgence() {
		return agence;
	}

	public void setAgence(Agence agence) {
		this.agence = agence;
	}
	
}
