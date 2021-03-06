package com.inti.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Reservation implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idResa;
	@Temporal(TemporalType.DATE)
	private Date dateCreation;
	@Temporal(TemporalType.DATE)
	private Date dateValidation;
	private String statut;

	@JsonIgnore
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "reservation_trajet", 
	joinColumns = @JoinColumn(name = "id_reservation", referencedColumnName = "idResa"), 
	inverseJoinColumns = @JoinColumn(name = "id_trajet", referencedColumnName = "idTrajet"))
	private Set<Trajet> trajets = new HashSet<>();

	@JsonIgnore
	@OneToOne(mappedBy="reservation")
	private Devis devis;

	@JsonIgnore
	@OneToOne(mappedBy="reservation")
	private Facture facture;

	@JsonIgnore
	@OneToOne(mappedBy="reservation")
	private AvisClient avisClient;
	
	@JsonIgnore
	@OneToMany(mappedBy = "reservation")
	Set<Reclamation> reclamations = new HashSet<>();

	@ManyToOne
	@JoinColumn(name = "id_client")
	private Client client;
	
	@ManyToOne
	@JoinColumn(name = "id_chauffeur")
	private Chauffeur chauffeur;

	public Reservation() {
	}

	public Reservation(Date dateCreation, Date dateValidation, String statut, Set<Trajet> trajets, Devis devis,
			Facture facture, AvisClient avisClient, Set<Reclamation> reclamations, Client client, Chauffeur chauffeur) {
		this.dateCreation = dateCreation;
		this.dateValidation = dateValidation;
		this.statut = statut;
		this.trajets = trajets;
		this.devis = devis;
		this.facture = facture;
		this.avisClient = avisClient;
		this.reclamations = reclamations;
		this.client = client;
		this.chauffeur = chauffeur;
	}

	public Long getIdResa() {
		return idResa;
	}

	public void setIdResa(Long idResa) {
		this.idResa = idResa;
	}

	public Date getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	public Date getDateValidation() {
		return dateValidation;
	}

	public void setDateValidation(Date dateValidation) {
		this.dateValidation = dateValidation;
	}

	public String getStatut() {
		return statut;
	}

	public void setStatut(String statut) {
		this.statut = statut;
	}

	public Set<Trajet> getTrajets() {
		return trajets;
	}

	public void setTrajets(Set<Trajet> trajets) {
		this.trajets = trajets;
	}

	public Devis getDevis() {
		return devis;
	}

	public void setDevis(Devis devis) {
		this.devis = devis;
	}

	public Facture getFacture() {
		return facture;
	}

	public void setFacture(Facture facture) {
		this.facture = facture;
	}

	public AvisClient getAvisClient() {
		return avisClient;
	}

	public void setAvisClient(AvisClient avisClient) {
		this.avisClient = avisClient;
	}

	public Set<Reclamation> getReclamations() {
		return reclamations;
	}

	public void setReclamations(Set<Reclamation> reclamations) {
		this.reclamations = reclamations;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Chauffeur getChauffeur() {
		return chauffeur;
	}

	public void setChauffeur(Chauffeur chauffeur) {
		this.chauffeur = chauffeur;
	}

	@Override
	public String toString() {
		return "Reservation [idResa=" + idResa + ", dateCreation=" + dateCreation + ", dateValidation=" + dateValidation
				+ ", statut=" + statut + ", trajets=" + trajets + ", devis=" + devis + "]";
	}

}
