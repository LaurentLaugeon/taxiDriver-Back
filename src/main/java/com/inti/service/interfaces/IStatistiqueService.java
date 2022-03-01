package com.inti.service.interfaces;

import java.util.List;

import com.inti.entities.Chauffeur;
import com.inti.entities.Statistique;
import com.inti.entities.Vehicule;

public interface IStatistiqueService {
	List<Statistique> findAll();

	Statistique findOne(Long idStatistique);

	Statistique save(Statistique stats);

	void delete(Long idStatistique);
	
	List<Chauffeur> chauffeursOrderBy();
	Vehicule vehiculeConsoPlus();
	Chauffeur chauffeurGagnePlus();
}
