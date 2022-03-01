package com.inti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inti.entities.Administrateur;
import com.inti.entities.Chauffeur;
import com.inti.service.interfaces.IStatistiqueService;

@RestController
@CrossOrigin
public class StatistiqueController {

	@Autowired
	IStatistiqueService statistiqueService;
	
	@GetMapping("statistique/chauffeurBest") 
	public Chauffeur chauffeurBest(){
		return statistiqueService.chauffeurGagnePlus();
	}
	
}
