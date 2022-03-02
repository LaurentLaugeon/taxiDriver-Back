package com.inti.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.inti.entities.Agence;
import com.inti.entities.Reservation;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Long>{
	@Query(value="SELECT reservation.* FROM reservation\r\n"
			+ "JOIN utilisateur WHERE utilisateur.id_utilisateur = reservation.id_chauffeur AND utilisateur.id_agence = ?", nativeQuery = true)
	List<Reservation> findByAgence(Long idagence);

}
