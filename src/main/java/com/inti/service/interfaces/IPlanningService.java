package com.inti.service.interfaces;

import java.util.List;

import com.inti.entities.Planning;

public interface IPlanningService {
	List<Planning> findAll();

	Planning findOne(Long idPlanning);

	Planning save(Planning planning);

	void delete(Long idPlanning);
}
