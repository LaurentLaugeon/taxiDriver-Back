package com.inti.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Devis implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idDevis;
	private double prixTot;
	@Temporal(TemporalType.DATE)
	private Date dateDevis;
	@OneToOne
	@JoinColumn(name="id_reservation")
	private Reservation reservation;

	public Devis() {
	}

	public Devis(Long idDevis, double prixTot, Date dateDevis) {
		this.prixTot = prixTot;
		this.dateDevis = dateDevis;
	}

	public Devis(double prixTot, Date dateDevis, Reservation reservation) {
		super();
		this.prixTot = prixTot;
		this.dateDevis = dateDevis;
		this.reservation = reservation;
	}

	public Long getIdDevis() {
		return idDevis;
	}

	public void setIdDevis(Long idDevis) {
		this.idDevis = idDevis;
	}

	public double getPrixTot() {
		return prixTot;
	}

	public void setPrixTot(double prixTot) {
		this.prixTot = prixTot;
	}

	public Date getDateDevis() {
		return dateDevis;
	}

	public void setDateDevis(Date dateDevis) {
		this.dateDevis = dateDevis;
	}

	public Reservation getReservation() {
		return reservation;
	}

	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
	}

	@Override
	public String toString() {
		return "Devis [idDevis=" + idDevis + ", prixTot=" + prixTot + ", dateDevis=" + dateDevis + ", reservation="
				+ reservation + "]";
	}

}
