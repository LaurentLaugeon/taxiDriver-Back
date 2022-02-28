package com.inti.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Reclamation implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idReclam;
	@Temporal(TemporalType.DATE)
	private Date dateReclam;
	private String titreReclam;
	private String commentaire;
	
	@ManyToOne
	@JoinColumn(name="id_reservation")
	private Reservation reservation;
	
	public Reclamation() {
		super();
	}
	
	public Reclamation(Date dateReclam, String titreReclam, String commentaire, Reservation reservation) {
		super();
		this.dateReclam = dateReclam;
		this.titreReclam = titreReclam;
		this.commentaire = commentaire;
		this.reservation = reservation;
	}

	public Reclamation(Date dateReclam, String titreReclam, String commentaire) {
		super();
		this.dateReclam = dateReclam;
		this.titreReclam = titreReclam;
		this.commentaire = commentaire;
	}
	
	public Reservation getReservation() {
		return reservation;
	}

	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
	}

	public Long getIdReclam() {
		return idReclam;
	}
	public void setIdReclam(Long idReclam) {
		this.idReclam = idReclam;
	}
	public Date getDateReclam() {
		return dateReclam;
	}
	public void setDateReclam(Date dateReclam) {
		this.dateReclam = dateReclam;
	}
	public String getTitreReclam() {
		return titreReclam;
	}
	public void setTitreReclam(String titreReclam) {
		this.titreReclam = titreReclam;
	}
	public String getCommentaire() {
		return commentaire;
	}
	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}
	@Override
	public String toString() {
		return "Reclamation [idReclam=" + idReclam + ", dateReclam=" + dateReclam + ", titreReclam=" + titreReclam
				+ ", commentaire=" + commentaire + "]";
	}
	
}
