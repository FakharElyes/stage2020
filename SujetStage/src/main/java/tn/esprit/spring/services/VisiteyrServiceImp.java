package tn.esprit.spring.services;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import tn.esprit.spring.entities.Visiteur;
import tn.esprit.spring.entities.WebOwner;
import tn.esprit.spring.repository.VisiteurRepository;

public class VisiteyrServiceImp implements VisiteurService {

	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
	LocalDateTime now = LocalDateTime.now();

	@Autowired
	VisiteurRepository visiteurRepository;

	public static final Logger l = LogManager.getLogger(WebOwnerServiceImp.class);

	@Override
	public long AddVisiteur(Visiteur visiteur, String siteWeb) {
		visiteur.setX_row(null);
		visiteur.setY_row(null);
		visiteur.setSiteWebVisite(siteWeb);
		visiteurRepository.save(visiteur);
		return visiteur.getIdVisiteur();
	}

	@Override
	public List<Visiteur> GetAllVisiteurs() {
		return (List<Visiteur>) visiteurRepository.findAll();
	}

	@Override
	public Visiteur GetVisiteurId(Long visiteurId) {
		Visiteur visiteur = visiteurRepository.findById(visiteurId).orElse(null);
		l.info("retrive blog by id +++++;" + visiteur);
		return visiteur;
	}

	@Override
	public void UpdateVisiteur(Long visiteurId) {
		visiteurRepository.UpdateVisiteur(now,visiteurId);
	}

	@Override
	public void UpdateRow(Long Xrow, Long Yrow, Long visiteurId) {
		visiteurRepository.UpdateXRow(Xrow, visiteurId);
		visiteurRepository.UpdateYRow(Yrow, visiteurId);
		
	}

}
