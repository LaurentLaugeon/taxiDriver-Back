package com.inti.service.interfaces;

import java.util.List;

import com.inti.entities.Client;

public interface IClientService {
	List<Client> findAll();

	Client findOne(Long idClient);

	Client save(Client client);

	void delete(Long idClient);
}
