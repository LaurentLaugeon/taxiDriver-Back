package com.inti.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.inti.entities.AvisClient;
import com.inti.entities.Chauffeur;

@Repository
public interface AvisClientRepository extends JpaRepository<AvisClient, Long>{
	
	@Query(value="SELECT * FROM gestion_taxi_driver_db.avis_client ac "
			+ "WHERE ac.id_reservation = gestion_taxi_driver_db.reservation.id_resa "
			+ "AND gestion_taxi_driver_db.reservation.id_chauffeur = ?", 
			nativeQuery = true)
	List<AvisClient> findByChauffeur(Long idChauffeur);
	
}
