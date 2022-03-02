package com.inti.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.inti.model.Adresse;

@Entity
@DiscriminatorValue("respo")
public class ResponsableAgence extends Utilisateur implements Serializable {
	@OneToOne
	@JoinColumn(name = "id_agence")
	private Agence agence;

	public ResponsableAgence() {
	}

	public ResponsableAgence(Agence agence) {
		this.agence = agence;
	}

	public Agence getAgence() {
		return agence;
	}

	public void setAgence(Agence agence) {
		this.agence = agence;
	}

	@Override
	public String toString() {
		return "ResponsableAgence [agence=" + agence + "]";
	}

}