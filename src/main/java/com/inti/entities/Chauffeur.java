package com.inti.entities;


import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
public class Chauffeur extends Utilisateur implements Serializable{
	private double note;
	
	@OneToMany(mappedBy = "chauffeur")
	private Set<Planning> plannings = new HashSet<>();
	
	@OneToOne
	@JoinColumn(name = "id_vehicule")
	private Vehicule vehicule;
	
	@OneToMany(mappedBy = "chauffeur")
	private Set<Reservation> reservations = new HashSet<>();

	public Chauffeur() {
	}

	public Chauffeur(double note) {
		this.note = note;
	}

	public Chauffeur(double note, Vehicule vehicule) {
		this.note = note;
		this.vehicule = vehicule;
	}

	public Chauffeur(double note, Set<Planning> plannings, Vehicule vehicule, Set<Reservation> reservations) {
		super();
		this.note = note;
		this.plannings = plannings;
		this.vehicule = vehicule;
		this.reservations = reservations;
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

	public Set<Reservation> getReservations() {
		return reservations;
	}

	public void setReservations(Set<Reservation> reservations) {
		this.reservations = reservations;
	}
	
}
