package com.inti.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.inti.entities.Agence;
import com.inti.entities.Reclamation;

@Repository
public interface ReclamationRepository extends JpaRepository<Reclamation, Long>{
	@Query(value= "SELECT r from Reclamation r "
			+ "JOIN Reservation resa WHERE r.reservation = resa "
			+ "JOIN Chauffeur c WHERE resa.chauffeur = c AND c.agence = ?", nativeQuery = true)
	List<Reclamation> findByAgence(Agence agence);
	
	
}
