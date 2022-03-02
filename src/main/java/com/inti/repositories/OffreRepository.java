package com.inti.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inti.entities.Agence;
import com.inti.entities.Offre;

@Repository
public interface OffreRepository extends JpaRepository<Offre, Long>{
	List<Offre> findByAgence(Agence agence);
}
