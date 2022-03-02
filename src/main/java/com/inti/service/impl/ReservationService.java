package com.inti.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.entities.Agence;
import com.inti.entities.Reservation;
import com.inti.repositories.ReservationRepository;
import com.inti.service.interfaces.IReservationService;

@Service
public class ReservationService implements IReservationService{
	@Autowired
	ReservationRepository reservationRepository;
	
	@Override
	public List<Reservation> findAll() {
		return reservationRepository.findAll();
	}

	@Override
	public Reservation findOne(Long idReservation) {
		return reservationRepository.findById(idReservation).get();
	}

	@Override
	public Reservation save(Reservation reservation) {
		return reservationRepository.save(reservation);
	}

	@Override
	public void delete(Long idReservation) {
		reservationRepository.deleteById(idReservation);
	}

	@Override
	public List<Reservation> findByAgence(Agence agence) {
		return reservationRepository.findByAgence(agence.getIdAgence());
	}
}
