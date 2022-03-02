package com.inti.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import com.inti.model.Adresse;

@Entity
@DiscriminatorValue("admin")
public class Administrateur extends Utilisateur implements Serializable{

	public Administrateur() {
		super();
	}

	public Administrateur(String nom, String prenom, String username, String password, String email, Adresse adresse,
			Set<Role> roles) {
		super(nom, prenom, username, password, email, adresse, roles);
	}
	
	
}
