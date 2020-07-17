package tn.esprit.spring.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class WebOwner implements Serializable {
	
	private static final long serialVersionUID = 6191889143079517027L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int IdWebOwner;

	@Column(name = "NomWebOwner")
	private String NomWebOwner;
	
	@Column(name = "PreNomWebOwner")
	private String PreNomWebOwner;
	
	@Column(name = "SiteWeb")
	private String SiteWeb;
	
	@Column(name = "visited")
	private int visited;
	
//-----------------------------------------------------------	
	
	
	public int getIdWebOwner() {
		return IdWebOwner;
	}

	public void setIdWebOwner(int idWebOwner) {
		IdWebOwner = idWebOwner;
	}

	public String getNomWebOwner() {
		return NomWebOwner;
	}

	public void setNomWebOwner(String nomWebOwner) {
		NomWebOwner = nomWebOwner;
	}

	public String getPreNomWebOwner() {
		return PreNomWebOwner;
	}

	public void setPreNomWebOwner(String preNomWebOwner) {
		PreNomWebOwner = preNomWebOwner;
	}

	public String getSiteWeb() {
		return SiteWeb;
	}

	public void setSiteWeb(String siteWeb) {
		SiteWeb = siteWeb;
	}

	public int getVisited() {
		return visited;
	}

	public void setVisited(int visited) {
		this.visited = visited;
	}
	
//----------------------------------------------------------------	

	@Override
	public String toString() {
		return "WebOwner [IdWebOwner=" + IdWebOwner + ", NomWebOwner=" + NomWebOwner + ", PreNomWebOwner="
				+ PreNomWebOwner + ", SiteWeb=" + SiteWeb + ", visited=" + visited + "]";
	}
	
	
	
}
