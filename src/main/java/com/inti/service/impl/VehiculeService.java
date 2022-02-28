package com.inti.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.entities.Vehicule;
import com.inti.repositories.VehiculeRepository;
import com.inti.service.interfaces.IVehiculeService;

@Service
public class VehiculeService implements IVehiculeService{
	@Autowired
	VehiculeRepository vehiculeRepository;
	
	@Override
	public List<Vehicule> findAll() {
		return vehiculeRepository.findAll();
	}

	@Override
	public Vehicule findOne(Long idVehicule) {
		return vehiculeRepository.findById(idVehicule).get();
	}

	@Override
	public Vehicule save(Vehicule vehicule) {
		return vehiculeRepository.save(vehicule);
	}

	@Override
	public void delete(Long idVehicule) {
		vehiculeRepository.deleteById(idVehicule);
	}
}
