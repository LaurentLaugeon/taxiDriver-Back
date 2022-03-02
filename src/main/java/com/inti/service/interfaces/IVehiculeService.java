package com.inti.service.interfaces;

import java.util.List;

import com.inti.entities.Agence;
import com.inti.entities.Vehicule;

public interface IVehiculeService {
	List<Vehicule> findAll();

	Vehicule findOne(Long idVehicule);

	Vehicule save(Vehicule vehicule);

	void delete(Long idVehicule);
	
	Vehicule vehiculeConsoPlus();
	
	
	List<Vehicule> findByAgence(Agence agence);
}	
