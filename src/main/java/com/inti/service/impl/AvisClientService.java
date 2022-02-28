package com.inti.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.entities.AvisClient;
import com.inti.repositories.AvisClientRepository;
import com.inti.service.interfaces.IAvisClientService;

@Service
public class AvisClientService implements IAvisClientService{
	@Autowired
	AvisClientRepository avisClientRepository;
	
	@Override
	public List<AvisClient> findAll() {
		return avisClientRepository.findAll();
	}

	@Override
	public AvisClient findOne(Long idAvisClient) {
		return avisClientRepository.findById(idAvisClient).get();
	}

	@Override
	public AvisClient save(AvisClient avisClient) {
		return avisClientRepository.save(avisClient);
	}

	@Override
	public void delete(Long idAvisClient) {
		avisClientRepository.deleteById(idAvisClient);
	}

}
