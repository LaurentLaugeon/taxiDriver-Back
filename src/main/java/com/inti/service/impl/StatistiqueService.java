package com.inti.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.entities.Chauffeur;
import com.inti.entities.Statistique;
import com.inti.entities.Vehicule;
import com.inti.repositories.StatistiqueRepository;
import com.inti.service.interfaces.IStatistiqueService;

@Service
public class StatistiqueService implements IStatistiqueService{
	@Autowired
	StatistiqueRepository statistiqueRepository;
	
	@Override
	public List<Statistique> findAll() {
		return statistiqueRepository.findAll();
	}

	@Override
	public Statistique findOne(Long idStatistique) {
		return statistiqueRepository.findById(idStatistique).get();
	}

	@Override
	public Statistique save(Statistique stats) {
		return statistiqueRepository.save(stats);
	}

	@Override
	public void delete(Long idStatistique) {
		statistiqueRepository.deleteById(idStatistique);
	}

	@Override
	public List<Chauffeur> chauffeursOrderBy() {
		return statistiqueRepository.chauffeursOrderBy();
	}

	@Override
	public Vehicule vehiculeConsoPlus() {
		return statistiqueRepository.vehiculeConsoPlus();
	}

	@Override
	public Chauffeur chauffeurGagnePlus() {
		return statistiqueRepository.chauffeurGagnePlus();
	}
}
