package tn.esprit.spring.services;

import java.util.List;
import java.util.Date;

import tn.esprit.spring.entities.Visiteur;


public interface VisiteurService {
	
	public long AddVisiteur(Visiteur visiteur,String siteWeb);

	public List<Visiteur> GetAllVisiteurs();

	public Visiteur GetVisiteurId(Long visiteurId);
	
	public void UpdateVisiteur(Long visiteurId, Date dateleave);


}
