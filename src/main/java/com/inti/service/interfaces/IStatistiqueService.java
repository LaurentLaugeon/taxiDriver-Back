package com.inti.service.interfaces;

import java.util.List;

import com.inti.entities.Statistique;

public interface IStatistiqueService {
	List<Statistique> findAll();

	Statistique findOne(Long idStatistique);

	Statistique save(Statistique stats);

	void delete(Long idStatistique);
}
