package com.inti.entities;

import java.util.Date;

import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

public class Facture {
	private Long idFacture;
	private double prixTot;
	@Temporal(TemporalType.DATE)
	private Date DateCreation;
	
	@OneToOne
	@JoinColumn(name="id_reservation")
	private Reservation reservation;
	
	public Facture() {
		super();
	}
	public Facture(double prixTot, Date dateCreation) {
		super();
		this.prixTot = prixTot;
		DateCreation = dateCreation;
	}
	
	public Facture(double prixTot, Date dateCreation, Reservation reservation) {
		super();
		this.prixTot = prixTot;
		DateCreation = dateCreation;
		this.reservation = reservation;
	}
	
	public Facture(double prixTot, Date dateCreation, Reservation reservation) {
		super();
		this.prixTot = prixTot;
		DateCreation = dateCreation;
		this.reservation = reservation;
	}
	public Reservation getReservation() {
		return reservation;
	}
	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
	}
	public Long getIdFacture() {
		return idFacture;
	}
	public void setIdFacture(Long idFacture) {
		this.idFacture = idFacture;
	}
	public double getPrixTot() {
		return prixTot;
	}
	public void setPrixTot(double prixTot) {
		this.prixTot = prixTot;
	}
	public Date getDateCreation() {
		return DateCreation;
	}
	public void setDateCreation(Date dateCreation) {
		DateCreation = dateCreation;
	}
	@Override
	public String toString() {
		return "Facture [idFacture=" + idFacture + ", prixTot=" + prixTot + ", DateCreation=" + DateCreation + "]";
	}
	
}
