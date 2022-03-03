package com.inti.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.entities.Administrateur;
import com.inti.entities.Chauffeur;
import com.inti.entities.Client;
import com.inti.entities.ResponsableAgence;
import com.inti.entities.Utilisateur;
import com.inti.repositories.AdministrateurRepository;
import com.inti.repositories.ChauffeurRepository;
import com.inti.repositories.ClientRepository;
import com.inti.repositories.ResponsableAgenceRepository;
import com.inti.repositories.UtilisateurRepository;
import com.inti.service.interfaces.IAdministrateurService;

@Service
public class AdministrateurService implements IAdministrateurService{

	@Autowired
	AdministrateurRepository administrateurRepository;
	
	@Autowired
	UtilisateurRepository utilisateurRepository;
	
	@Autowired
	ResponsableAgenceRepository respoAgenceRepository;
	
	@Autowired
	ClientRepository clientRepository;
	
	@Autowired
	ChauffeurRepository chauffeurRepository;
	
	
	@Override
	public List<Administrateur> findAllAdmin() {
		return administrateurRepository.findAll();
	}
	@Override
	public Administrateur findOneAdmin(Long idAdmin) {
		return administrateurRepository.findById(idAdmin).get();
	}
	@Override
	public Administrateur saveAdmin(Administrateur admin) {
		return administrateurRepository.save(admin);
	}
	@Override
	public void deleteAdmin(Long idAdmin) {
		administrateurRepository.deleteById(idAdmin);
	}
	
	
	@Override
	public List<ResponsableAgence> findAllRespo() {
		return respoAgenceRepository.findAll();
	}
	@Override
	public ResponsableAgence findOneRespo(Long idRespo) {
		return respoAgenceRepository.findById(idRespo).get();
	}
	@Override
	public ResponsableAgence saveRespo(ResponsableAgence respo) {
		return respoAgenceRepository.save(respo);
	}
	@Override
	public void deleteRespo(Long idRespo) {
		respoAgenceRepository.deleteById(idRespo);
	}
	
	
	
	@Override
	public List<Client> findAllClient() {
		return clientRepository.findAll();
	}
	@Override
	public Client findOneClient(Long idClient) {
		return clientRepository.findById(idClient).get();
	}
	@Override
	public Client saveClient(Client client) {
		return clientRepository.save(client);
	}
	@Override
	public void deleteClient(Long idClient) {
		clientRepository.deleteById(idClient);
		
	}

	@Override
	public List<Chauffeur> findAllChauffeur() {
		return chauffeurRepository.findAll();
	}
	@Override
	public Chauffeur findOneChauffeur(Long idChauffeur) {
		return chauffeurRepository.findById(idChauffeur).get();
	}
	@Override
	public Chauffeur saveChauffeur(Chauffeur client) {
		return chauffeurRepository.save(client);
	}
	@Override
	public void deleteChauffeur(Long idChauffeur) {
		chauffeurRepository.deleteById(idChauffeur);
		
	}

}
