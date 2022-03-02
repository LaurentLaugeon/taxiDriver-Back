package com.inti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inti.entities.Vehicule;
import com.inti.service.interfaces.IVehiculeService;

@RestController
@CrossOrigin
public class VehiculeController {

	@Autowired
	IVehiculeService vehiculeService;
	
	@GetMapping("statistique/vehiculeConsoPlus")
	public Vehicule vehiculeConsoPlus() {
		return vehiculeService.vehiculeConsoPlus();
	}
}
