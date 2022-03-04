package com.inti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.inti.entities.Administrateur;
import com.inti.entities.AvisClient;
import com.inti.entities.Chauffeur;
import com.inti.entities.Client;
import com.inti.entities.ResponsableAgence;
import com.inti.entities.Statistique;
import com.inti.entities.Utilisateur;
import com.inti.service.interfaces.IAdministrateurService;
import com.inti.service.interfaces.IAvisClientService;
import com.inti.service.interfaces.IClientService;
import com.inti.service.interfaces.IResponsableAgenceService;
import com.inti.service.interfaces.IStatistiqueService;
import com.inti.service.interfaces.IUtilisateurService;

@RestController
@CrossOrigin
public class AdministrateurController {

	@Autowired
	IAdministrateurService administrateurService;
	@Autowired
	IResponsableAgenceService respoAgenceService;
	@Autowired
	IClientService clientService;
	@Autowired
	IUtilisateurService utilisateurService;
	@Autowired
	IStatistiqueService statistiqueService;
	@Autowired
	IAvisClientService avisClientService;
	
	
		//Afficher la liste des administrateurs
		@GetMapping("administrateur") 
		public List<Administrateur> findAllAdmin(){
			return administrateurService.findAllAdmin();
		}
		// Ajouter un compte Administrateur
		@PostMapping("administrateur/ajouterCompte") // localhost:8080/administrateur/compte 
		public Administrateur saveAdmin(@RequestBody Administrateur admin) { // recupere les données en utilisant le body de la requete 
			return administrateurService.saveAdmin(admin); 
		}
		// Supprimer un compte Administrateur
		@DeleteMapping("administrateur/supprimerCompte/{idAdmin}")
		public void deleteAdmin(@PathVariable("idAdmin")Long idAdmin) {
			administrateurService.deleteAdmin(idAdmin);
		}
		// Modifier un compte  Administrateur
		@PutMapping
		@RequestMapping(value="administrateur/updateCompte/{idAdmin}", method=RequestMethod.PUT)
		public Administrateur updateAdmin(@PathVariable("idAdmin")Long idAdmin, @RequestBody Administrateur admin) {
			Administrateur currentAdministrateur=administrateurService.findOneAdmin(idAdmin); 
			currentAdministrateur.setNom(admin.getNom()); 
			currentAdministrateur.setPrenom(admin.getPrenom());
			currentAdministrateur.setUsername(admin.getUsername()); 
			currentAdministrateur.setPassword(admin.getPassword()); 
			currentAdministrateur.setEmail(admin.getEmail());
			currentAdministrateur.setAdresse(admin.getAdresse());
			return administrateurService.saveAdmin(currentAdministrateur);
		}
		
		//Afficher la liste des client
				@GetMapping("administrateur/clients") 
				public List<Client> findAllClient(){
					return administrateurService.findAllClient();
				}
				// Ajouter un compte client
				@PostMapping("administrateur/client/ajouterCompte") // localhost:8080/administrateur/compte 
				public Client saveClient(@RequestBody Client client) { // recupere les données en utilisant le body de la requete 
					return administrateurService.saveClient(client); 
				}
				// Supprimer un compte client
				@DeleteMapping("administrateur/client/supprimerCompte/{idClient}")
				public void deleteClient(@PathVariable("idClient")Long idClient) {
					administrateurService.deleteClient(idClient);
				}
				// Modifier un compte  client
				@PutMapping
				@RequestMapping(value="administrateur/client/updateCompte/{idClient}", method=RequestMethod.PUT)
				public Client updateClient(@PathVariable("idClient")Long idClient, @RequestBody Client client) {
					Client currentClient=administrateurService.findOneClient(idClient); 
					currentClient.setNom(client.getNom()); 
					currentClient.setPrenom(client.getPrenom());
					currentClient.setUsername(client.getUsername()); 
					currentClient.setPassword(client.getPassword()); 
					currentClient.setEmail(client.getEmail());
					currentClient.setAdresse(client.getAdresse());
					currentClient.setPointsFidelite(client.getPointsFidelite());
					return administrateurService.saveClient(currentClient);
				}
				
				//Afficher la liste des responsables d'agence
				@GetMapping("administrateur/respoAgences") 
				public List<ResponsableAgence> findAllRespo(){
					return administrateurService.findAllRespo();
				}
				// Ajouter un compte responsable d'agence
				@PostMapping("administrateur/respoAgence/ajouterCompte") // localhost:8080/administrateur/compte 
				public ResponsableAgence saveRespo(@RequestBody ResponsableAgence respo) { // recupere les données en utilisant le body de la requete 
					return administrateurService.saveRespo(respo); 
				}
				// Supprimer un compte responsable d'agence
				@DeleteMapping("administrateur/respoAgence/supprimerCompte/{idRespo}")
				public void deleteRespo(@PathVariable("idRespo")Long idRespo) {
					administrateurService.deleteRespo(idRespo);
				}
				// Modifier un compte  responsable agence
				@PutMapping
				@RequestMapping(value="administrateur/respoAgence/updateCompte/{idRespo}", method=RequestMethod.PUT)
				public ResponsableAgence updateAdmin(@PathVariable("idRespo")Long idRespo, @RequestBody ResponsableAgence respo) {
					ResponsableAgence currentRespo=administrateurService.findOneRespo(idRespo); 
					currentRespo.setNom(respo.getNom()); 
					currentRespo.setPrenom(respo.getPrenom());
					currentRespo.setUsername(respo.getUsername()); 
					currentRespo.setPassword(respo.getPassword()); 
					currentRespo.setEmail(respo.getEmail());
					currentRespo.setAdresse(respo.getAdresse());
					currentRespo.setAgence(respo.getAgence());
					return administrateurService.saveRespo(currentRespo);
				}
				
				//Afficher la liste des chauffeurs
				@GetMapping("administrateur/chauffeurs") 
				public List<Chauffeur> findAllChauffeur(){
					return administrateurService.findAllChauffeur();
				}
				// Ajouter un compte chauffeur
				@PostMapping("administrateur/chauffeur/ajouterCompte") // localhost:8080/administrateur/compte 
				public Chauffeur saveChauffeur(@RequestBody Chauffeur chauffeur) { // recupere les données en utilisant le body de la requete 
					return administrateurService.saveChauffeur(chauffeur); 
				}
				// Supprimer un compte chauffeur
				@DeleteMapping("administrateur/chauffeur/supprimerCompte/{idChauffeur}")
				public void deleteChauffeur(@PathVariable("idChauffeur")Long idChauffeur) {
					administrateurService.deleteChauffeur(idChauffeur);
				}
				// Modifier un compte chauffeur
				@PutMapping
				@RequestMapping(value="administrateur/chauffeur/updateCompte/{idChauffeur}", method=RequestMethod.PUT)
				public Chauffeur updateChauffeur(@PathVariable("idChauffeur")Long idChauffeur, @RequestBody Chauffeur chauffeur) {
					Chauffeur currentChauffeur=administrateurService.findOneChauffeur(idChauffeur); 
					currentChauffeur.setNom(chauffeur.getNom()); 
					currentChauffeur.setPrenom(chauffeur.getPrenom());
					currentChauffeur.setUsername(chauffeur.getUsername()); 
					currentChauffeur.setPassword(chauffeur.getPassword()); 
					currentChauffeur.setEmail(chauffeur.getEmail());
					currentChauffeur.setAdresse(chauffeur.getAdresse());
					currentChauffeur.setAgence(chauffeur.getAgence());
					currentChauffeur.setVehicule(chauffeur.getVehicule());
					return administrateurService.saveChauffeur(currentChauffeur);
				}
		
		//Afficher la liste des commentaires
		@GetMapping("administrateur/avisClient") 
		public List<AvisClient> findAllAvis(){
			return avisClientService.findAll();
		}
		
		// Supprimer un commentaire
		@DeleteMapping("administrateur/commentaire/{idCom}")
		public void deleteCommentaire(@PathVariable("idCom")Long idCommentaire) {
			avisClientService.delete(idCommentaire);
		}
		
		// Ajouter une donnée statistique
		@PostMapping("administrateur/statistique")
		public Statistique saveStatistique(@RequestBody Statistique statistique) { 
			return statistiqueService.save(statistique); 
		}
		
		// Supprimer une donnée statistique 
		@DeleteMapping("administrateur/statistique/{idStat}")
		public void deleteStatistique(@PathVariable("idStat")Long idStatistique) {
			statistiqueService.delete(idStatistique);
		}
		
}
