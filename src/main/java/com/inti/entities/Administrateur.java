package com.inti.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import com.inti.model.Adresse;

@Entity
@DiscriminatorValue("admin")
public class Administrateur extends Utilisateur implements Serializable{
	
}
