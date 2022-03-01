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
import com.inti.entities.Statistique;
import com.inti.entities.Utilisateur;
import com.inti.service.interfaces.IAdministrateurService;
import com.inti.service.interfaces.IAvisClientService;
import com.inti.service.interfaces.IStatistiqueService;
import com.inti.service.interfaces.IUtilisateurService;

@RestController
@CrossOrigin
public class AdministrateurController {

	@Autowired
	IAdministrateurService administrateurService;
	
	@Autowired
	IUtilisateurService utilisateurService;
	
	@Autowired
	IStatistiqueService statistiqueService;
	
	@Autowired
	IAvisClientService avisClientService;
	
	
		//Afficher la liste des administrateurs
		@GetMapping("administrateurs") 
		public List<Administrateur> findAllAdmin(){
			return administrateurService.findAll();
		}
		
		// Ajouter un compte Administrateur
		@PostMapping("administrateur/compte") // localhost:8080/administrateur/compte 
		public Administrateur saveAdministrateur(@RequestBody Administrateur administrateur) { // recupere les données en utilisant le body de la requete 
			return administrateurService.save(administrateur); 
		}
		
		// Supprimer un compte Administrateur
		@DeleteMapping("administrateur/compte/{idAdmin}")
		public void deleteAdministrateur(@PathVariable("idAdmin")Long idAdministrateur) {
			administrateurService.delete(idAdministrateur);
		}
		
		// Modifier un compte 
		@PutMapping
		@RequestMapping(value="administrateur/utilisateur/{idU}", method=RequestMethod.PUT)
		public Utilisateur updateUtilisateur(@PathVariable("idU")Long idUtilisateur, @RequestBody Utilisateur utilisateur) {
			Utilisateur currentUtilisateur=utilisateurService.findOne(idUtilisateur); 
			currentUtilisateur.setNom(utilisateur.getNom()); 
			currentUtilisateur.setPrenom(utilisateur.getPrenom());
			currentUtilisateur.setUsername(utilisateur.getUsername()); 
			currentUtilisateur.setPassword(utilisateur.getPassword()); 
			currentUtilisateur.setEmail(utilisateur.getEmail());
			currentUtilisateur.setAdresse(utilisateur.getAdresse());
			currentUtilisateur.setRoles(utilisateur.getRoles()); 
			return utilisateurService.save(currentUtilisateur);
		}
		
		//Afficher la liste des commentaires
		@GetMapping("administrateur/avisClient") 
		public List<AvisClient> findAllAvis(){
			return avisClientService.findAll();
		}
		
		// Supprimer un commentaire
		@DeleteMapping("administrateur/commentaire/{idCom}")
		public void deleteCommentaire(@PathVariable("idCom")Long idCommentaire) {
			administrateurService.delete(idCommentaire);
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
