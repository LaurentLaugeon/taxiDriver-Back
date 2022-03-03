package com.inti.service.interfaces;

import java.util.List;

import com.inti.entities.Administrateur;
import com.inti.entities.Chauffeur;
import com.inti.entities.Client;
import com.inti.entities.ResponsableAgence;
import com.inti.entities.Utilisateur;

public interface IAdministrateurService {
	List<Administrateur> findAllAdmin();
	Administrateur findOneAdmin(Long idAdmin);
	Administrateur saveAdmin(Administrateur admin);
	void deleteAdmin(Long idAdmin);
	
	List<ResponsableAgence> findAllRespo();
	ResponsableAgence findOneRespo(Long idRespo);
	ResponsableAgence saveRespo(ResponsableAgence respo);
	void deleteRespo(Long idRespo);
	
	List<Client> findAllClient();
	Client findOneClient(Long idClient);
	Client saveClient(Client client);
	void deleteClient(Long idClient);
	
	List<Chauffeur> findAllChauffeur();
	Chauffeur findOneChauffeur(Long idChauffeur);
	Chauffeur saveChauffeur(Chauffeur chauffeur);
	void deleteChauffeur(Long idChauffeur);
	
}

