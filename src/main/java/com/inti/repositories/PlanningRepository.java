package com.inti.repositories;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.inti.entities.Chauffeur;
import com.inti.entities.Planning;

@Repository
public interface PlanningRepository extends JpaRepository<Planning, Long>{
	@Query(value="SELECT * FROM Planning p WHERE p.id_planning = ? AND "
			+ "p.id_chauffeur=?",nativeQuery=true)
	Planning findByDateAndChauffeur(Long idPlanning, Long idChauffeur);
	
}
