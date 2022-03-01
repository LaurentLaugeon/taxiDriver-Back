package com.inti.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.inti.model.Adresse;
import com.inti.model.Adresse2;


@Entity
public class Trajet implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idTrajet;
	private Adresse adresseDep;
	private Adresse2 adresseArr;
	private double distance;
	private double duree;
	@Temporal(TemporalType.DATE)
	private Date dateDep;
	@Temporal(TemporalType.DATE)
	private Date dateArr;
	
	public Trajet() {
	}
	public Trajet(Adresse adresse, Adresse2 adresse2, double distance, double duree, Date dateDep, Date dateArr) {
		super();
		this.adresse = adresse;
		this.adresse2 = adresse2;

		this.distance = distance;
		this.duree = duree;
		this.dateDep = dateDep;
		this.dateArr = dateArr;
	}
	public Long getIdTrajet() {
		return idTrajet;
	}
	public void setIdTrajet(Long idTrajet) {
		this.idTrajet = idTrajet;
	}
	public Adresse getAdresse() {
		return adresse;
	}
	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	public Adresse2 getAdresseArr() {
		return adresseArr;
	}

	public void setAdresseArr(Adresse2 adresseArr) {
		this.adresseArr = adresseArr;

	}
	public double getDistance() {
		return distance;
	}
	public void setDistance(double distance) {
		this.distance = distance;
	}
	public double getDuree() {
		return duree;
	}
	public void setDuree(double duree) {
		this.duree = duree;
	}
	public Date getDateDep() {
		return dateDep;
	}
	public void setDateDep(Date dateDep) {
		this.dateDep = dateDep;
	}
	public Date getDateArr() {
		return dateArr;
	}
	public void setDateArr(Date dateArr) {
		this.dateArr = dateArr;
	}
	@Override
	public String toString() {
		return "Trajet [idTrajet=" + idTrajet + ", adresse=" + adresse + ", adresse2=" + adresse2 + ", distance="
				+ distance + ", duree=" + duree + ", dateDep=" + dateDep + ", dateArr=" + dateArr + "]";
	}
	
	

}
