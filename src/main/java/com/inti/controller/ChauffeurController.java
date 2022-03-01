package com.inti.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.inti.entities.Chauffeur;
import com.inti.entities.Planning;
import com.inti.service.interfaces.IChauffeurService;
import com.inti.service.interfaces.IPlanningService;

@RestController
@CrossOrigin
public class ChauffeurController {
	
	@Autowired
	IChauffeurService chauffeurService;
	
	@Autowired
	IPlanningService planningService;

	@GetMapping("chauffeur/{idChauffeur}")
	public Chauffeur affichageNote(@PathVariable("idChauffeur") Long idChauffeur) {
		return chauffeurService.findOne(idChauffeur);
	}
	
	@GetMapping("chauffeur/planning/{idChauffeur}/{jour}")
	public Planning affichagePlanning(@PathVariable("idChauffeur") Long idChauffeur, @PathVariable("jour") Date datePlanning) {
		Chauffeur currentChauffeur = chauffeurService.findOne(idChauffeur);
		return planningService.findByDateAndChauffeur(datePlanning,currentChauffeur);
	}
}
