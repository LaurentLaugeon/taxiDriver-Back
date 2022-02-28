package com.inti.entities;


import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Chauffeur extends Utilisateur implements Serializable{
	private double note;
	
	@OneToMany(mappedBy = "chauffeur")
	private Set<Planning> plannings = new HashSet<>();
	
	@OneToOne(mappedBy = "chauffeur")
	@JoinColumn(name = "id_vehicule")
	private Vehicule vehicule;
	
	@OneToMany(mappedBy = "chauffeur")
	private Set<Reservations> reservations = new HashSet<>();

	public Chauffeur() {
	}

	public Chauffeur(double note) {
		this.note = note;
	}

	public Chauffeur(double note, Vehicule vehicule) {
		this.note = note;
		this.vehicule = vehicule;
	}

	public double getNote() {
		return note;
	}

	public void setNote(double note) {
		this.note = note;
	}

	public Set<Planning> getPlannings() {
		return plannings;
	}

	public void setPlannings(Set<Planning> plannings) {
		this.plannings = plannings;
	}

	public Vehicule getVehicule() {
		return vehicule;
	}

	public void setVehicule(Vehicule vehicule) {
		this.vehicule = vehicule;
	}

	public Set<Reservations> getReservations() {
		return reservations;
	}

	public void setReservations(Set<Reservations> reservations) {
		this.reservations = reservations;
	}
	
}
