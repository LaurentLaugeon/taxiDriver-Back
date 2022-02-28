package com.inti.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.entities.Agence;
import com.inti.repositories.AgenceRepository;
import com.inti.service.interfaces.IAgenceService;

@Service
public class AgenceService implements IAgenceService{
	
	@Autowired
	AgenceRepository agenceRepository;
	
	@Override
	public List<Agence> findAll() {
		return agenceRepository.findAll();
	}

	@Override
	public Agence findOne(Long idAgence) {
		return agenceRepository.findById(idAgence).get();
	}

	@Override
	public Agence save(Agence agence) {
		return agenceRepository.save(agence);
	}

	@Override
	public void delete(Long idAgence) {
		agenceRepository.deleteById(idAgence);
	}
}
