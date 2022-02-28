package com.inti.service.interfaces;

import java.util.List;

import com.inti.entities.Devis;

public interface IDevisService {
	List<Devis> findAll();

	Devis findOne(Long idDevis);

	Devis save(Devis devis);

	void delete(Long idDevis);
}
