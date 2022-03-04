package com.inti.service.interfaces;

import java.util.List;

import com.inti.entities.Agence;
import com.inti.entities.Client;
import com.inti.entities.Reservation;

public interface IReservationService {
	List<Reservation> findAll();

	Reservation findOne(Long idReservation);

	Reservation save(Reservation reservation);

	void delete(Long idReservation);
	
	List<Reservation> findByAgence(Agence agence);
	
	List<Reservation> findByClient(Client client);
}
