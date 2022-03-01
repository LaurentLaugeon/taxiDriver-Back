package com.inti.service.interfaces;

import java.util.List;

import com.inti.entities.Agence;
import com.inti.entities.Chauffeur;

public interface IChauffeurService {
	List<Chauffeur> findAll();

	Chauffeur findOne(Long idChauffeur);

	Chauffeur save(Chauffeur chauffeur);

	void delete(Long idChauffeur);
	
	List<Chauffeur> findByAgence(Agence agence);
}
