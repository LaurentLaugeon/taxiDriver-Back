package com.inti.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.inti.entities.Agence;
import com.inti.entities.Chauffeur;

@Repository
public interface ChauffeurRepository extends JpaRepository<Chauffeur, Long>{
	public List<Chauffeur> findByAgence(Agence agence);
	
	// Faire la liste des Chauffeurs du mieux noté au moins bien noté 
		@Query(value="SELECT * from utilisateur WHERE type=? ORDER BY note DESC", nativeQuery=true)
		public List<Chauffeur> chauffeursOrderBy(String type);
		
		/*// Chauffeur qui fait gagner le + (somme des ses factures qui est la plus élevée)
		@Query(value="SELECT * FROM Chauffeur "
				+ "MAX(SUM(prix_tot WHERE facture.id_reservation = reservation.id_resa "
				+ "AND reservation.id_chauffeur = chauffeur.id_utilisateur ) FROM facture) ", nativeQuery=true)
		Chauffeur chauffeurGagnePlus();*/ 
}
