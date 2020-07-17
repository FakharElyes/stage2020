package tn.esprit.spring.services;

import java.util.List;
import tn.esprit.spring.entities.WebOwner;

public interface WebOwnerService {
	
	public long AddWebOwner(WebOwner webOwner);

	public List<WebOwner> GetAllWebOwner();

	public WebOwner GetWebOwnerId(Long webOwnerId);

	public void UpdateWebOwner(Long WebOwnerId, String siteWeb);
	
	public void DeleteWebOwner(Long webOwnerId);

}
