package com.inti.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.entities.Agence;
import com.inti.entities.Reclamation;
import com.inti.repositories.ReclamationRepository;
import com.inti.service.interfaces.IReclamationService;

@Service
public class ReclamationService implements IReclamationService{
	@Autowired
	ReclamationRepository reclamationRepository;
	
	@Override
	public List<Reclamation> findAll() {
		return reclamationRepository.findAll();
	}

	@Override
	public Reclamation findOne(Long idReclamation) {
		return reclamationRepository.findById(idReclamation).get();
	}

	@Override
	public Reclamation save(Reclamation reclamation) {
		return reclamationRepository.save(reclamation);
	}

	@Override
	public void delete(Long idReclamation) {
		reclamationRepository.deleteById(idReclamation);
	}

	@Override
	public List<Reclamation> findByAgence(Agence agence) {
		return reclamationRepository.findByAgence(agence.getIdAgence());
	}
}
