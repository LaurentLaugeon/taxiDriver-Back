package com.inti.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.inti.entities.Agence;
import com.inti.entities.Reservation;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Long>{
	@Query(value="SELECT r FROM Reservation r "
			+ "INNER JOIN Chauffeur c WHERE r.chauffeur = c AND c.agence=?", nativeQuery = true)
	List<Reservation> findByAgence(Agence agence);

}
