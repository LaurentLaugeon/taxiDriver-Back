package com.inti.service.interfaces;

import java.util.List;

import com.inti.entities.Offre;

public interface IOffreService {
	List<Offre> findAll();

	Offre findOne(Long idOffre);

	Offre save(Offre offre);

	void delete(Long idOffre);
}
