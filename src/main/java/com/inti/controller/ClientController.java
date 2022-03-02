package com.inti.controller;

import java.util.List;
//import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.inti.entities.Agence;
import com.inti.entities.AvisClient;
import com.inti.entities.Chauffeur;
import com.inti.entities.Client;
import com.inti.entities.Offre;
import com.inti.entities.Reservation;
import com.inti.entities.Statistique;
import com.inti.entities.Utilisateur;
import com.inti.service.interfaces.IAgenceService;
import com.inti.service.interfaces.IAvisClientService;
import com.inti.service.interfaces.IChauffeurService;
import com.inti.service.interfaces.IClientService;
import com.inti.service.interfaces.IOffreService;
import com.inti.service.interfaces.IReservationService;
import com.inti.service.interfaces.IStatistiqueService;
import com.inti.service.interfaces.ITrajetService;
import com.inti.service.interfaces.IUtilisateurService;

@RestController
@CrossOrigin
public class ClientController {
	@Autowired
	IClientService clientService;

	@Autowired
	IReservationService reservationService;

	@Autowired
	IChauffeurService chauffeurService;

	@Autowired
	IStatistiqueService statistiqueService;

	@Autowired
	ITrajetService trajetService;

	@Autowired
	IAvisClientService avisClientService;

	@Autowired
	IAgenceService agenceService;

	@Autowired
	IOffreService offreService;
	
	@Autowired
	IUtilisateurService utilisateurService;
	
	//affiche tous les clients (test)
	@GetMapping("client/tous")
	public List<Client> findAllClients() {
		System.out.println("client tous : ");
		return clientService.findAll();
	}

	// recupere toutes les offres
	@GetMapping("client")
	public List<Offre> findAllOffres() {
		return offreService.findAll();
	}

	// ajoute une reservation
	@PostMapping("client/reservation")
	public Reservation addReservation(@RequestBody Reservation reservation) {
		return reservationService.save(reservation);
	}

	// recupere tous les chauffeurs
	@GetMapping("client/chauffeurs")
	public List<Chauffeur> findAllChauffeurs() {
		return chauffeurService.findAll();
	}

	// recupere toutes les statistiques
	@GetMapping("client/statistiques")
	public List<Statistique> findAllStatistiques() {
		return statistiqueService.findAll();
	}

	// recupere toutes les reservations
	@GetMapping("client/courses")
	public List<Reservation> findAllReservations() {
		return reservationService.findAll();
	}

	// ajoute un avis client
	@PostMapping("client/avisClient")
	public AvisClient saveAvis(@RequestBody AvisClient avis) {
		return avisClientService.save(avis);
	}

	// supprime l'avis client idAvis
	@DeleteMapping("client/annulationAvis/{idAvis}")
	public void deleteAvis(@PathVariable("idAvis") Long idAvis) {
		avisClientService.delete(idAvis);
	}

	// supprime une reservation
	@DeleteMapping("client/annulationReservation/{idResa}")
	public void deleteReservation(@PathVariable("idResa") Long idResa) {
		reservationService.delete(idResa);
	}

	// edite le profil de l'utilisateur
	@PutMapping
	@RequestMapping(value="client/profil/{idU}", method=RequestMethod.PUT)
	public Utilisateur updateUtilisateur(@PathVariable("idU") Long idUtilisateur, @RequestBody Utilisateur utilisateur) {
		Utilisateur currentUtilisateur = utilisateurService.findOne(idUtilisateur);
		currentUtilisateur.setNom(utilisateur.getNom());
		currentUtilisateur.setPrenom(utilisateur.getPrenom());
		currentUtilisateur.setUsername(utilisateur.getUsername());
		currentUtilisateur.setPassword(utilisateur.getPassword());
		currentUtilisateur.setEmail(utilisateur.getEmail());
		currentUtilisateur.setAdresse(utilisateur.getAdresse());
		return utilisateurService.save(currentUtilisateur);
	}

	// recupere toutes les agences
	@GetMapping("client/agences")
	public List<Agence> findAllAgences() {
		return agenceService.findAll();
	}
}
