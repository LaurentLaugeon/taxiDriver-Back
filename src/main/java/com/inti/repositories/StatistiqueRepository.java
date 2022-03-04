package com.inti.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.inti.entities.Agence;
import com.inti.entities.Chauffeur;
import com.inti.entities.Statistique;
import com.inti.entities.Utilisateur;
import com.inti.entities.Vehicule;

@Repository
public interface StatistiqueRepository extends JpaRepository<Statistique, Long>{

	public List<Statistique> findByAgence(Agence agence);
}
