package com.inti.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
@DiscriminatorValue("client")
public class Client extends Utilisateur implements Serializable {
	private int pointsFidelite;
	
	@OneToMany(mappedBy = "client")
	private Set<Reservation> reservations = new HashSet<>();

	public Client() {
	}

	public Client(int pointsFidelite) {
		this.pointsFidelite = pointsFidelite;
	}

	public Client(int pointsFidelite, Set<Reservation> reservations) {
		this.pointsFidelite = pointsFidelite;
		this.reservations = reservations;
	}

	public int getPointsFidelite() {
		return pointsFidelite;
	}

	public void setPointsFidelite(int pointsFidelite) {
		this.pointsFidelite = pointsFidelite;
	}

	public Set<Reservation> getReservations() {
		return reservations;
	}

	public void setReservations(Set<Reservation> reservations) {
		this.reservations = reservations;
	}
	
}
