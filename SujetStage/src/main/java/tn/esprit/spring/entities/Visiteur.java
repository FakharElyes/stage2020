package tn.esprit.spring.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;

@Entity
public class Visiteur implements Serializable{


	private static final long serialVersionUID = 6191889143079517027L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int IdVisiteur;
	
	@Column(name = "SiteWebVisite")
	private String SiteWebVisite;
	
	@Column(name = "Xrow")
	private Long X_row;
	
	@Column(name = "Yrow")
	private Long Y_row;
	
	@Column(name = "Deg")
	private Long Deg;
	
	@Column(name = "DateVisite")
	@Temporal(TemporalType.TIMESTAMP)
	@CreationTimestamp
	private Date DateVisite;
	
	@Column(name = "DateLeave")
	@Temporal(TemporalType.TIMESTAMP)
	@CreationTimestamp
	private Date DateLeave;
	
//--------------------------------------------------	

	public int getIdVisiteur() {
		return IdVisiteur;
	}

	public void setIdVisiteur(int idVisiteur) {
		IdVisiteur = idVisiteur;
	}

	public String getSiteWebVisite() {
		return SiteWebVisite;
	}

	public void setSiteWebVisite(String siteWebVisite) {
		SiteWebVisite = siteWebVisite;
	}

	public Date getDateVisite() {
		return DateVisite;
	}

	public void setDateVisite(Date dateVisite) {
		DateVisite = dateVisite;
	}
	
	public Date getDateLeave() {
		return DateLeave;
	}

	public void setDateLeave(Date dateLeave) {
		DateLeave = dateLeave;
	}

	public Long getX_row() {
		return X_row;
	}

	public void setX_row(Long x_row) {
		X_row = x_row;
	}

	public Long getY_row() {
		return Y_row;
	}

	public void setY_row(Long y_row) {
		Y_row = y_row;
	}

	public Long getDeg() {
		return Deg;
	}

	public void setDeg(Long deg) {
		Deg = deg;
	}

		
	
//---------------------------------------------	

	@Override
	public String toString() {
		return "Visiteur [IdVisiteur=" + IdVisiteur + ", SiteWebVisite=" + SiteWebVisite + ", X_row=" + X_row
				+ ", Y_row=" + Y_row + ", Deg=" + Deg + ", DateVisite=" + DateVisite + ", DateLeave=" + DateLeave + "]";
	}
	
}
