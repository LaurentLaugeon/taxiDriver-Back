package com.inti.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inti.entities.Agence;
import com.inti.entities.Chauffeur;

@Repository
public interface ChauffeurRepository extends JpaRepository<Chauffeur, Long>{
	public List<Chauffeur> findByAgence(Agence agence);
}
