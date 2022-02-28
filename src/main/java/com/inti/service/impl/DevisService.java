package com.inti.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.entities.Devis;
import com.inti.repositories.DevisRepository;
import com.inti.service.interfaces.IDevisService;

@Service
public class DevisService implements IDevisService{
	@Autowired
	DevisRepository devisRepository;
	
	@Override
	public List<Devis> findAll() {
		return devisRepository.findAll();
	}

	@Override
	public Devis findOne(Long idDevis) {
		return devisRepository.findById(idDevis).get();
	}

	@Override
	public Devis save(Devis devis) {
		return devisRepository.save(devis);
	}

	@Override
	public void delete(Long idDevis) {
		devisRepository.deleteById(idDevis);
	}
}
