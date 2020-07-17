package tn.esprit.spring.services;

import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.springframework.beans.factory.annotation.Autowired;

import tn.esprit.spring.entities.WebOwner;
import tn.esprit.spring.repository.WebOwnerRepository;

public class WebOwnerServiceImp implements  WebOwnerService{
	
	@Autowired
	WebOwnerRepository webOwnerRepository;

	public static final Logger l = LogManager.getLogger(WebOwnerServiceImp.class);

	@Override
	public long AddWebOwner(WebOwner webOwner) {
		webOwner.setVisited(0);
		webOwnerRepository.save(webOwner);
		return webOwner.getIdWebOwner();
	}

	@Override
	public List<WebOwner> GetAllWebOwner() {
		return (List<WebOwner>) webOwnerRepository.findAll();
	}

	@Override
	public WebOwner GetWebOwnerId(Long webOwnerId) {
		WebOwner webOwner = webOwnerRepository.findById(webOwnerId).orElse(null);
		l.info("retrive blog by id +++++;" + webOwner);
		return webOwner;
	}

	@Override
	public void UpdateWebOwner(Long WebOwnerId, String siteWeb) {
		webOwnerRepository.UpdateSiteWeb(siteWeb, WebOwnerId);
	}

	@Override
	public void DeleteWebOwner(Long webOwnerId) {
		webOwnerRepository.deleteById(webOwnerId);
		
	}

}
