package com.inti.entities;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class AvisClient implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idAvis;
	private double note;
	private String commentaire;
	private Date dateAvis;
	
	@OneToOne
	@JoinColumn(name="id_reservation")
	private Reservation reservation;

	public AvisClient() {
		super();
	}

	public AvisClient(double note, String commentaire, Date dateAvis) {
		super();
		this.note = note;
		this.commentaire = commentaire;
		this.dateAvis = dateAvis;
	}

	public AvisClient(double note, String commentaire, Date dateAvis, Reservation reservation) {
		super();
		this.note = note;
		this.commentaire = commentaire;
		this.dateAvis = dateAvis;
		this.reservation = reservation;
	}

	public Long getIdAvis() {
		return idAvis;
	}

	public void setIdAvis(Long idAvis) {
		this.idAvis = idAvis;
	}

	public double getNote() {
		return note;
	}

	public void setNote(double note) {
		this.note = note;
	}

	public String getCommentaire() {
		return commentaire;
	}

	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}

	public Date getDateAvis() {
		return dateAvis;
	}

	public void setDateAvis(Date dateAvis) {
		this.dateAvis = dateAvis;
	}

	public Reservation getReservation() {
		return reservation;
	}

	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
	}

	@Override
	public String toString() {
		return "AvisClient [idAvis=" + idAvis + ", note=" + note + ", commentaire=" + commentaire + ", dateAvis="
				+ dateAvis + "]";
	}
}
