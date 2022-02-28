package com.inti.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.entities.Facture;
import com.inti.repositories.FactureRepository;
import com.inti.service.interfaces.IFactureService;

@Service
public class FactureService implements IFactureService{
	@Autowired
	FactureRepository factureRepository;
	
	@Override
	public List<Facture> findAll() {
		return factureRepository.findAll();
	}

	@Override
	public Facture findOne(Long idFacture) {
		return factureRepository.findById(idFacture).get();
	}

	@Override
	public Facture save(Facture facture) {
		return factureRepository.save(facture);
	}

	@Override
	public void delete(Long idFacture) {
		factureRepository.deleteById(idFacture);
	}
}
