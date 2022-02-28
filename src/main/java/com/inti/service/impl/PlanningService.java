package com.inti.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.entities.Planning;
import com.inti.repositories.PlanningRepository;
import com.inti.service.interfaces.IPlanningService;

@Service
public class PlanningService implements IPlanningService{
	@Autowired
	PlanningRepository planningRepository;
	
	@Override
	public List<Planning> findAll() {
		return planningRepository.findAll();
	}

	@Override
	public Planning findOne(Long idPlanning) {
		return planningRepository.findById(idPlanning).get();
	}

	@Override
	public Planning save(Planning planning) {
		return planningRepository.save(planning);
	}

	@Override
	public void delete(Long idPlanning) {
		planningRepository.deleteById(idPlanning);
	}
}
