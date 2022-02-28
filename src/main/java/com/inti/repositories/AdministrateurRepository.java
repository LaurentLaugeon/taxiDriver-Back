package com.inti.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inti.entities.Administrateur;

@Repository
public interface AdministrateurRepository extends JpaRepository<Administrateur, Long>{

}
