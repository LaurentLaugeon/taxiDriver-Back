package com.inti.service.interfaces;

import java.util.List;

import com.inti.entities.ResponsableAgence;

public interface IResponsableAgenceService {
	List<ResponsableAgence> findAll();

	ResponsableAgence findOne(Long idResponsableAgence);

	ResponsableAgence save(ResponsableAgence responsableAgence);

	void delete(Long idResponsableAgence);
}
