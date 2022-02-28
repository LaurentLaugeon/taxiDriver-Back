package com.inti.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.entities.Client;
import com.inti.repositories.ClientRepository;
import com.inti.service.interfaces.IClientService;

@Service
public class ClientService implements IClientService{
	@Autowired
	ClientRepository clientRepository;
	
	@Override
	public List<Client> findAll() {
		return clientRepository.findAll();
	}

	@Override
	public Client findOne(Long idClient) {
		return clientRepository.findById(idClient).get();
	}

	@Override
	public Client save(Client client) {
		return clientRepository.save(client);
	}

	@Override
	public void delete(Long idClient) {
		clientRepository.deleteById(idClient);
	}
}
