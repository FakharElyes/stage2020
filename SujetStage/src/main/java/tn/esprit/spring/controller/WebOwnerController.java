package tn.esprit.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;


import tn.esprit.spring.entities.WebOwner;
import tn.esprit.spring.services.WebOwnerService;

public class WebOwnerController {
	
	@Autowired
	WebOwnerService webOwnerService;
	WebOwner wo = new WebOwner();
	
	@GetMapping("/retrieve-all-WebOwners")
	@ResponseBody
	public List<WebOwner> getWebOwner() {
		List<WebOwner> list = webOwnerService.GetAllWebOwner();
		return list;
	}
	
	
	@PostMapping("/add-WebOwners")
	@ResponseBody
	public WebOwner saveWebOwner(@RequestBody WebOwner webOwner) {
		webOwnerService.AddWebOwner(webOwner);
		return webOwner;
	}

	
	@PutMapping(value = "/Edit-WebOwners/{WebOwnerId}/{SiteWeb1}")
	@ResponseBody
	public void EditWebOwner(@PathVariable("WebOwnerId")Long WebOwnerId,@PathVariable("SiteWeb1") String SiteWeb1) {
		webOwnerService.UpdateWebOwner((long) WebOwnerId, SiteWeb1);	
	}

	
	@DeleteMapping("/rmv-WebOwners/{WebOwnerId}")
	@ResponseBody
	public void SuprimerWebOwner(@PathVariable("WebOwnerId")Long WebOwnerId) {
		webOwnerService.DeleteWebOwner((long) WebOwnerId);
	}

}
