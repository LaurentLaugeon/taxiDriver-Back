package com.inti.controller;

import java.util.Date;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.inti.entities.AvisClient;
import com.inti.entities.Chauffeur;
import com.inti.entities.Planning;
import com.inti.entities.Reservation;
import com.inti.service.interfaces.IAvisClientService;
import com.inti.service.interfaces.IChauffeurService;
import com.inti.service.interfaces.IPlanningService;
import com.inti.service.interfaces.IReservationService;

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

	@GetMapping("chauffeur")
	public List<Chauffeur> affichage() {
		System.out.println("ALLLLLLLLEZ!!!!!");
		return chauffeurService.findAll();
	}
	
	@GetMapping("chauffeur/{id}")
	public Chauffeur affichageNote(@PathVariable("id") Long idChauffeur) {
		return chauffeurService.findOne(idChauffeur);
	}
	
	@GetMapping("chauffeur/planning/{idChauffeur}/{jour}")
	public Planning affichagePlanning(@PathVariable("idChauffeur") Long idChauffeur, @PathVariable("jour") Date datePlanning) {
		Chauffeur currentChauffeur = chauffeurService.findOne(idChauffeur);
		return planningService.findByDateAndChauffeur(datePlanning,currentChauffeur);
	}
	
//	@GetMapping("chauffeur/avisClient/{idChauffeur}")
//	public AvisClient affichageAvisClient(@PathVariable("idChauffeur") Long idChauffeur) {
//		Chauffeur currentChauffeur = chauffeurService.findOne(idChauffeur);
//		
//		
//		return avisClientService.findByChauffeur(idChauffeur);
//	}

}
