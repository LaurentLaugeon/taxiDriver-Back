package com.inti.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.inti.entities.Agence;
import com.inti.entities.Chauffeur;
import com.inti.entities.Statistique;
import com.inti.entities.Vehicule;

@Repository
public interface StatistiqueRepository extends JpaRepository<Statistique, Long>{

	// Faire la liste des Chauffeurs du mieux noté au moins bien noté 
	@Query(value="SELECT * from Chauffeur ORDER BY note", nativeQuery=true)
	public List<Chauffeur> chauffeursOrderBy();
	
	// Voiture qui consomme le plus 
	@Query(value="MAX (conso) FROM vehicule", nativeQuery=true)
	public Vehicule vehiculeConsoPlus();
	
	// Chauffeur qui fait gagner le + (somme des ses factures qui est la plus élevée)
	@Query(value="SELECT * FROM Chauffeur "
			+ "MAX(SUM(prix_tot WHERE facture.id_reservation = reservation.id_resa "
			+ "AND reservation.id_chauffeur = chauffeur.id_utilisateur ) FROM facture) ", nativeQuery=true)
	Chauffeur chauffeurGagnePlus();
	
	public List<Statistique> findByAgence(Agence agence);
}
