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
		super();
	}

	public ResponsableAgence(String nom, String prenom, String username, String password, String email, Adresse adresse,
			Set<Role> roles) {
		super(nom, prenom, username, password, email, adresse, roles);
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