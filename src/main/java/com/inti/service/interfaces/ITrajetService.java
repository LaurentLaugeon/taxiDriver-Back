package com.inti.service.interfaces;

import java.util.List;

import com.inti.entities.Trajet;

public interface ITrajetService {
	List<Trajet> findAll();

	Trajet findOne(Long idTrajet);

	Trajet save(Trajet trajet);

	void delete(Long idTrajet);
}
