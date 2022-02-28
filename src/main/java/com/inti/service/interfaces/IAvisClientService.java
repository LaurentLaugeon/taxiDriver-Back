package com.inti.service.interfaces;

import java.util.List;

import com.inti.entities.AvisClient;

public interface IAvisClientService {
	List<AvisClient> findAll();

	AvisClient findOne(Long idAvisClient);

	AvisClient save(AvisClient avisClient);

	void delete(Long idAvisClient);
}
