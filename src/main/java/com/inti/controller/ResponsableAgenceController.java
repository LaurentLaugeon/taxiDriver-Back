package com.inti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.inti.entities.Agence;
import com.inti.entities.Chauffeur;
import com.inti.entities.Offre;
import com.inti.entities.Reclamation;
import com.inti.entities.Reservation;
import com.inti.entities.ResponsableAgence;
import com.inti.entities.Statistique;
import com.inti.entities.Vehicule;
import com.inti.service.interfaces.IAgenceService;
import com.inti.service.interfaces.IChauffeurService;
import com.inti.service.interfaces.IOffreService;
import com.inti.service.interfaces.IReclamationService;
import com.inti.service.interfaces.IReservationService;
import com.inti.service.interfaces.IResponsableAgenceService;
import com.inti.service.interfaces.IStatistiqueService;
import com.inti.service.interfaces.IVehiculeService;

@RestController
@CrossOrigin
public class ResponsableAgenceController {

	@Autowired
	IResponsableAgenceService responsableAgenceService;
	@Autowired
	IStatistiqueService statistiqueService;
	@Autowired
	IAgenceService agenceService;
	@Autowired
	IChauffeurService chauffeurService;
	@Autowired
	IVehiculeService vehiculeService;
	@Autowired
	IReclamationService reclamationService;
	@Autowired
	IOffreService offreService;
	@Autowired
	IReservationService reservationService;

	// page d'acceuil pour les utilisateurs avec le role de responsable d'agence
	@GetMapping("/respoAgence")
	public List<ResponsableAgence> acceuilRespoAgence() {
		return responsableAgenceService.findAll();
	}

	// Consultation des Statistiques
	@GetMapping("/respoAgence/statistiques/{idRespoAgence}")
	public List<Statistique> statRespoAgence(@PathVariable("idRespoAgence") Long idRespoAgence) {
		ResponsableAgence currentRespoAgence = responsableAgenceService.findOne(idRespoAgence);
		Agence currentAgence = currentRespoAgence.getAgence();
		return statistiqueService.findByAgence(currentAgence);
	}

	// Gestion des chauffeurs

	// Afficher les chauffeurs de son agence
	@GetMapping("/respoAgence/chauffeurs/{idRespoAgence}")
	public List<Chauffeur> afficherChauffeursByAgence(@PathVariable("idRespoAgence") Long idRespoAgence) {
		System.out.println("responsable="+idRespoAgence);
		ResponsableAgence currentRespoAgence = responsableAgenceService.findOne(idRespoAgence);
		System.out.println("current respo agence" + currentRespoAgence);
		Agence currentAgence = currentRespoAgence.getAgence();
		System.out.println("current agence " + currentAgence);
		List<Chauffeur> chauffeurs = chauffeurService.findAll();
		for (Chauffeur chauffeur : chauffeurs) {
			if (chauffeur.getAgence() != currentAgence) {
				chauffeurs.remove(chauffeur);
			}
		}
		return chauffeurs;
	}

	// Ajouter un chauffeur à son agence
	@PostMapping("/respoAgence/saveChauffeur")
	public Chauffeur saveChauffeurRespo(@RequestBody Chauffeur chauffeur) {
		return chauffeurService.save(chauffeur);
	}

	// Editer un chauffeur de son agence (seulement modification de la voiture)
	@PutMapping("respoAgence/chauffeurs/{idChauffeur}")
	public Chauffeur updateChauffeurRespo(@PathVariable("idChauffeur") Long idChauffeur,
			@RequestBody Chauffeur chauffeur) {
		Chauffeur currentChauffeur = chauffeurService.findOne(idChauffeur);
		currentChauffeur.setVehicule(chauffeur.getVehicule());
		return chauffeurService.save(currentChauffeur);
	}

	// Supprimer un chauffeur de son agence
	@DeleteMapping("respoAgence/chauffeurs/{idChauffeur}")
	public void deleteChauffeurRespo(@PathVariable("idChauffeur") Long idChauffeur) {
		chauffeurService.delete(idChauffeur);
	}

	// Gestion des vehicules

	// Afficher les vehicules de son agence
	@GetMapping("/respoAgence/vehicules/{idRespoAgence}")
	public List<Vehicule> afficherVehiculesByAgence(@PathVariable("idRespoAgence") Long idRespoAgence) {
		ResponsableAgence currentRespoAgence = responsableAgenceService.findOne(idRespoAgence);
		Agence currentAgence = currentRespoAgence.getAgence();
		return vehiculeService.findByAgence(currentAgence);
	}

	// Ajouter un vehicule à son agence
	@PostMapping("/respoAgence/saveVehicule")
	public Vehicule saveVehiculeRespo(@RequestBody Vehicule vehicule) {
		return vehiculeService.save(vehicule);
	}

	// Editer un vehicule de son agence
	@PutMapping("respoAgence/vehicules/{idVehicule}")
	public Vehicule updateVehiculeRespo(@PathVariable("idVehicule") Long idVehicule, @RequestBody Vehicule vehicule) {
		Vehicule currentVehicule = vehiculeService.findOne(idVehicule);
		currentVehicule.setModel(vehicule.getModel());
		currentVehicule.setImmatriculation(vehicule.getImmatriculation());
		currentVehicule.setConso(vehicule.getConso());
		currentVehicule.setNbPlace(vehicule.getNbPlace());
		currentVehicule.setCapaciteCoffre(vehicule.getCapaciteCoffre());
		currentVehicule.setAgence(vehicule.getAgence());
		//currentVehicule.setChauffeur(vehicule.getChauffeur());
		return vehiculeService.save(currentVehicule);
	}

	// Supprimer un vehicule de son agence
	@DeleteMapping("respoAgence/vehicules/{idVehicule}")
	public void deleteVehiculeRespo(@PathVariable("idVehicule") Long idVehicule) {
		vehiculeService.delete(idVehicule);
	}

	// Gestion des reclamations

	// Afficher les reclamations de son agence
	@GetMapping("respoAgence/reclamations/{idRespoAgence}")
	public List<Reclamation> afficherReclamationsByAgence(@PathVariable("idRespoAgence") Long idRespoAgence) {
		ResponsableAgence currentRespoAgence = responsableAgenceService.findOne(idRespoAgence);
		Agence currentAgence = currentRespoAgence.getAgence();
		return reclamationService.findByAgence(currentAgence);
	}

	// Editer une reclamation de son agence
	@PutMapping("respoAgence/reclamations/{idReclamation}")
	public Reclamation updateReclamationRespo(@PathVariable("idReclamation") Long idReclamation,
			@RequestBody Reclamation reclamation) {
		Reclamation currentReclamation = reclamationService.findOne(idReclamation);
		currentReclamation.setCommentaire(reclamation.getCommentaire());
		return reclamationService.save(currentReclamation);
	}

	// Supprimer un reclamation de son agence
	@DeleteMapping("respoAgence/reclamations/{idReclamation}")
	public void deleteReclamationRespo(@PathVariable("idReclamation") Long idReclamation) {
		reclamationService.delete(idReclamation);
	}

	// Gestion des offres

	// Afficher les offres de son agence
	@GetMapping("/respoAgence/offres/{idRespoAgence}")
	public List<Offre> afficherOffresByAgence(@PathVariable("idRespoAgence") Long idRespoAgence) {
		ResponsableAgence currentRespoAgence = responsableAgenceService.findOne(idRespoAgence);
		Agence currentAgence = currentRespoAgence.getAgence();
		return offreService.findByAgence(currentAgence);
	}

	// Ajouter une offre à son agence
	@PostMapping("/respoAgence/saveOffre")
	public Offre saveOffreRespo(@RequestBody Offre offre) {
		return offreService.save(offre);
	}

	// Editer une offre de son agence
	@PutMapping("respoAgence/offres/{idOffre}")
	public Offre updateOffreRespo(@PathVariable("idOffre") Long idOffre, @RequestBody Offre offre) {
		Offre currentOffre = offreService.findOne(idOffre);
		currentOffre.setNbVoyFree(offre.getNbVoyFree());
		return offreService.save(currentOffre);
	}

	// Supprimer un offre de son agence
	@DeleteMapping("respoAgence/offres/{idOffre}")
	public void deleteOffreRespo(@PathVariable("idOffre") Long idOffre) {
		offreService.delete(idOffre);
	}

	// Gestion des reservations

	// Afficher les reservations de son agence
	@GetMapping("/respoAgence/reservations/{idRespoAgence}")
	public List<Reservation> afficherReservationsByAgence(@PathVariable("idRespoAgence") Long idRespoAgence) {
		ResponsableAgence currentRespoAgence = responsableAgenceService.findOne(idRespoAgence);
		Agence currentAgence = currentRespoAgence.getAgence();
		return reservationService.findByAgence(currentAgence);
	}

	// Ajouter un devis de son agence
	@PutMapping("respoAgence/devis/{idReservation}")
	public Reservation updateDevisRespo(@PathVariable("idReservation") Long idReservation,
			@RequestBody Reservation reservation) {
		Reservation currentReservation = reservationService.findOne(idReservation);
		currentReservation.setDevis(reservation.getDevis());
		return reservationService.save(currentReservation);
	}

	// Ajouter une facture de son agence
	@PutMapping("respoAgence/factures/{idReservation}")
	public Reservation updateFactureRespo(@PathVariable("idReservation") Long idReservation,
			@RequestBody Reservation reservation) {
		Reservation currentReservation = reservationService.findOne(idReservation);
		currentReservation.setFacture(reservation.getFacture());
		return reservationService.save(currentReservation);
	}

	// Supprimer un Reservation de son agence
	@DeleteMapping("respoAgence/reservations/{idReservation}")
	public void deleteReservationRespo(@PathVariable("idReservation") Long idReservation) {
		reservationService.delete(idReservation);
	}

}
