package com.inti.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import antlr.collections.List;

@Entity
public class Trajet implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idTrajet;
	private String adresseDep;
	private String adresseArr;
	private double distance;
	private float duree;
	@Temporal(TemporalType.DATE)
	private Date dateDep;
	@Temporal(TemporalType.DATE)
	private Date dateArr;
	
	public Trajet() {
	}

	public Trajet(String adresseDep, String adresseArr, double distance, float duree, Date dateDep, Date dateArr) {
		this.adresseDep = adresseDep;
		this.adresseArr = adresseArr;
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

	public String getAdresseDep() {
		return adresseDep;
	}

	public void setAdresseDep(String adresseDep) {
		this.adresseDep = adresseDep;
	}

	public String getAdresseArr() {
		return adresseArr;
	}

	public void setAdresseArr(String adresseArr) {
		this.adresseArr = adresseArr;
	}

	public double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}

	public float getDuree() {
		return duree;
	}

	public void setDuree(float duree) {
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
		return "Trajet [idTrajet=" + idTrajet + ", adresseDep=" + adresseDep + ", adresseArr=" + adresseArr
				+ ", distance=" + distance + ", duree=" + duree + ", dateDep=" + dateDep + ", dateArr=" + dateArr + "]";
	}

}
