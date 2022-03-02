package com.inti.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.inti.entities.Agence;
import com.inti.entities.Reclamation;

@Repository
public interface ReclamationRepository extends JpaRepository<Reclamation, Long>{
	@Query(value= "SELECT reclamation.* FROM reclamation\r\n"
			+ "LEFT JOIN reservation ON reservation.id_resa = reclamation.id_reservation\r\n"
			+ "LEFT JOIN utilisateur ON utilisateur.id_utilisateur = reservation.id_chauffeur AND utilisateur.id_agence = ?", nativeQuery = true)
	List<Reclamation> findByAgence(Long idAgence);
	
	
}
