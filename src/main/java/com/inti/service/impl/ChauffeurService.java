package com.inti.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.entities.Agence;
import com.inti.entities.Chauffeur;
import com.inti.repositories.ChauffeurRepository;
import com.inti.repositories.StatistiqueRepository;
import com.inti.service.interfaces.IChauffeurService;

@Service
public class ChauffeurService implements IChauffeurService{
	@Autowired
	ChauffeurRepository chauffeurRepository;
	
	@Autowired
	StatistiqueRepository statistiqueRepository;
	
	@Override
	public List<Chauffeur> findAll() {
		return chauffeurRepository.findAll();
	}

	@Override
	public Chauffeur findOne(Long idChauffeur) {
		return chauffeurRepository.findById(idChauffeur).get();
	}

	@Override
	public Chauffeur save(Chauffeur chauffeur) {
		return chauffeurRepository.save(chauffeur);
	}

	@Override
	public void delete(Long idChauffeur) {
		chauffeurRepository.deleteById(idChauffeur);
	}

	@Override
	public List<Chauffeur> findByAgence(Agence agence) {
		return chauffeurRepository.findByAgence(agence);
	}
	
	@Override
	public List<Chauffeur> chauffeursOrderBy(String type) {
		return chauffeurRepository.chauffeursOrderBy(type);
	}
	
	/*@Override
	public Chauffeur chauffeurGagnePlus() {
		return chauffeurRepository.chauffeurGagnePlus();
	}*/
}
