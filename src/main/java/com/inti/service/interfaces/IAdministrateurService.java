package com.inti.service.interfaces;

import java.util.List;

import com.inti.entities.Administrateur;

public interface IAdministrateurService {
	List<Administrateur> findAll();

	Administrateur findOne(Long idAdministrateur);

	Administrateur save(Administrateur admin);

	void delete(Long idAdministrateur);
}

