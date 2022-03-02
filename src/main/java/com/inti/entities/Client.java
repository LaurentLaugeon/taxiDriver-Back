package com.inti.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

import com.inti.model.Adresse;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@DiscriminatorValue("client")
public class Client extends Utilisateur implements Serializable {
	private int pointsFidelite;

	@OneToMany(mappedBy = "client")
	@JsonIgnore
	private Set<Reservation> reservations = new HashSet<>();

	public Client() {
		super();
	}

	public Client(String nom, String prenom, String username, String password, String email, Adresse adresse,
			Set<Role> roles) {
	}

	public int getPointsFidelite() {
		return pointsFidelite;
	}

	public void SetPointsFidelite(int pointsFidelite) {
		this.pointsFidelite = pointsFidelite;
	}

	public Set<Reservation> getReservations() {
		return reservations;
	}

	public void SetReservations(Set<Reservation> reservations) {
		this.reservations = reservations;
	}

}
