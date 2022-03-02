package com.inti.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.inti.entities.AvisClient;
import com.inti.entities.Chauffeur;

@Repository
public interface AvisClientRepository extends JpaRepository<AvisClient, Long>{
	
	@Query(value="SELECT * FROM avis_client ac "
			+ "WHERE ac.id_reservation = reservation.id_resa "
			+ "AND reservation.id_chauffeur = ?", 
			nativeQuery = true)
	List<AvisClient> findByChauffeur(Long idChauffeur);
	
}
