package com.inti.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inti.entities.ResponsableAgence;

@Repository
public interface ResponsableAgenceRepository extends JpaRepository<ResponsableAgence, Long>{

}
