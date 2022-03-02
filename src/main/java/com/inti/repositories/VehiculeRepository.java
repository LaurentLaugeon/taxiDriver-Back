package com.inti.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.inti.entities.Agence;
import com.inti.entities.Vehicule;

@Repository
public interface VehiculeRepository extends JpaRepository<Vehicule, Long>{
	 public List<Vehicule> findByAgence(Agence agence);

		// Voiture qui consomme le plus 
		@Query(value="SELECT MAX(conso) FROM vehicule", nativeQuery=true)
		public Vehicule vehiculeConsoPlus();
		
		
}
