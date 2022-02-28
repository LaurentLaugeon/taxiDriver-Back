package com.inti.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.entities.Offre;
import com.inti.repositories.OffreRepository;
import com.inti.service.interfaces.IOffreService;

@Service
public class OffreService implements IOffreService{
	@Autowired
	OffreRepository offreRepository;
	
	@Override
	public List<Offre> findAll() {
		return offreRepository.findAll();
	}

	@Override
	public Offre findOne(Long idOffre) {
		return offreRepository.findById(idOffre).get();
	}

	@Override
	public Offre save(Offre offre) {
		return offreRepository.save(offre);
	}

	@Override
	public void delete(Long idOffre) {
		offreRepository.deleteById(idOffre);
	}
}
