package com.inti.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.entities.Trajet;
import com.inti.repositories.TrajetRepository;
import com.inti.service.interfaces.ITrajetService;

@Service
public class TrajetService implements ITrajetService{
	@Autowired
	TrajetRepository trajetRepository;
	
	@Override
	public List<Trajet> findAll() {
		return trajetRepository.findAll();
	}

	@Override
	public Trajet findOne(Long idTrajet) {
		return trajetRepository.findById(idTrajet).get();
	}

	@Override
	public Trajet save(Trajet trajet) {
		return trajetRepository.save(trajet);
	}

	@Override
	public void delete(Long idTrajet) {
		trajetRepository.deleteById(idTrajet);
	}
}
