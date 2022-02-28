package com.inti.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inti.entities.Devis;

@Repository
public interface DevisRepository extends JpaRepository<Devis, Long>{

}
