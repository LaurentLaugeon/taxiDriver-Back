package com.inti.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Planning implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idPlanning;
	@Temporal(TemporalType.DATE)
	private Date datePlanning;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="id_chauffeur")
	private Chauffeur chauffeur;
	
	public Planning() {
		super();
	}
	public Planning(Date datePlanning) {
		super();
		this.datePlanning = datePlanning;
	}
	public Planning(Date datePlanning, Chauffeur chauffeur) {
		super();
		this.datePlanning = datePlanning;
		this.chauffeur = chauffeur;
	}
	public Long getIdPlanning() {
		return idPlanning;
	}
	public void setIdPlanning(Long idPlanning) {
		this.idPlanning = idPlanning;
	}
	public Date getDatePlanning() {
		return datePlanning;
	}
	public void setDatePlanning(Date datePlanning) {
		this.datePlanning = datePlanning;
	}
	public Chauffeur getChauffeur() {
		return chauffeur;
	}
	public void setChauffeur(Chauffeur chauffeur) {
		this.chauffeur = chauffeur;
	}
	@Override
	public String toString() {
		return "Planning [idPlanning=" + idPlanning + ", datePlanning=" + datePlanning + "]";
	}
}
