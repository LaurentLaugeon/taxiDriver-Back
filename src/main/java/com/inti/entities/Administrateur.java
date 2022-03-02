package com.inti.entities;

import java.io.Serializable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("admin")
public class Administrateur extends Utilisateur implements Serializable{
	
}
