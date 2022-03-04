package com.inti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.inti.entities.Chauffeur;
import com.inti.entities.Client;
import com.inti.entities.Reservation;
import com.inti.service.interfaces.IClientService;
import com.inti.service.interfaces.IReservationService;

@RestController
@CrossOrigin
public class ReservationController {
	@Autowired
	IReservationService reservationService;

	@Autowired
	IClientService clientService;

	@GetMapping("client/reservations/{idClient}")
	public List<Reservation> findByClient(@PathVariable("idClient") Long idClient) {
		Client currentClient = clientService.findOne(idClient);
		return reservationService.findByClient(currentClient);
	}
	
	@GetMapping("reservation")
	public List<Reservation> findAllReservation(){
		return reservationService.findAll();
	}
	@PostMapping("reservation") 
	public Reservation save(@RequestBody Reservation reservation) { 
		return reservationService.save(reservation); 
	}
	@DeleteMapping("reservation/supprimer/{idR}")
	public void delete(@PathVariable("idR")Long idResa) {
		reservationService.delete(idResa);
	}

	@PutMapping
	@RequestMapping(value="reservation/{idR}", method=RequestMethod.PUT)
	public Reservation update(@PathVariable("idR")Long idResa, @RequestBody Reservation reservation) {
		Reservation currentReservation=reservationService.findOne(idResa); 
		currentReservation.setDateCreation(reservation.getDateCreation()); 
		currentReservation.setDateValidation(reservation.getDateValidation());
		currentReservation.setStatut(reservation.getStatut()); 
		currentReservation.setChauffeur(reservation.getChauffeur()); 
		currentReservation.setClient(reservation.getClient());
		return reservationService.save(currentReservation);
	}
	
}
