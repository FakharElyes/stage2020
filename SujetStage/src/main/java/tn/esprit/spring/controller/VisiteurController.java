package tn.esprit.spring.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import tn.esprit.spring.entities.Visiteur;
import tn.esprit.spring.services.VisiteurService;



public class VisiteurController {
	
	@Autowired
	VisiteurService visiteurService;
	Visiteur v = new Visiteur();
	
	@GetMapping("/retrieve-all-visiteurs")
	@ResponseBody
	public List<Visiteur> getVisiteur() {
		List<Visiteur> list = visiteurService.GetAllVisiteurs();
		return list;
	}
	
	
	@PostMapping("/add-visiteurs")
	@ResponseBody
	public Visiteur saveVisiteur(@RequestBody Visiteur visiteur, String siteWeb) {
		visiteurService.AddVisiteur(visiteur,siteWeb);
		return visiteur;
	}

	
	@PutMapping(value = "/Edit-visiteurs/{VisiteurId}/{DateLeave1}")
	@ResponseBody
	public void EditVisiteur(@PathVariable("VisiteurId")Long VisiteurId,@PathVariable("DateLeave1") Date DateLeave1) {
		visiteurService.UpdateVisiteur((long) VisiteurId, DateLeave1);	
	}


}
