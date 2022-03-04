package com.inti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.inti.entities.AvisClient;
import com.inti.entities.Chauffeur;
import com.inti.entities.Planning;
import com.inti.entities.Vehicule;
import com.inti.service.interfaces.IAvisClientService;
import com.inti.service.interfaces.IChauffeurService;
import com.inti.service.interfaces.IPlanningService;
import com.inti.service.interfaces.IReservationService;
import com.inti.service.interfaces.IStatistiqueService;

@RestController
@CrossOrigin
public class ChauffeurController {
	
	@Autowired
	IChauffeurService chauffeurService;
	
	@Autowired
	IPlanningService planningService;
	
	@Autowired
	IAvisClientService avisClientService;
	
	@Autowired
	IReservationService reservationService;
	
	@Autowired
	IStatistiqueService statistiqueService;

	// Affiche tous les chauffeurs
	@GetMapping("chauffeur")
	public List<Chauffeur> affichage() {
		return chauffeurService.findAll();
	}
	
	// Affiche un chauffeur
	@GetMapping("chauffeur/{id}")
	public Chauffeur affichageNote(@PathVariable("id") Long idChauffeur) {
		return chauffeurService.findOne(idChauffeur);
	}
	
	// Affiche le planning d'un jour pour un chauffeur
	@GetMapping("chauffeur/planning/{idChauffeur}/{idPlanning}")
	public Planning affichagePlanning(@PathVariable("idChauffeur") Long idChauffeur, @PathVariable("idPlanning") Long idPlanning) {
//		Chauffeur currentChauffeur = chauffeurService.findOne(idChauffeur);
//		Planning currentPlanning = planningService.findOne(idPlanning);
		return planningService.findByDateAndChauffeur(idPlanning,idChauffeur);
	}
	
	
	// Affichge la liste des avis des clients pour un chauffeur donné
	@GetMapping("chauffeur/avisClient/{idChauffeur}")
	public List<AvisClient> affichageAvisClient(@PathVariable("idChauffeur") Long idChauffeur) {
		return avisClientService.findByChauffeur(idChauffeur);
	}

	@GetMapping("statistique/chauffeurBest")
	public List<Chauffeur> chauffeursOrderBy(@RequestParam(required = false) String type){
		return chauffeurService.chauffeursOrderBy(type);
	}

}
