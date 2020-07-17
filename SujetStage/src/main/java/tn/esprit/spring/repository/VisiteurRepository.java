package tn.esprit.spring.repository;

import java.util.Date;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import tn.esprit.spring.entities.Visiteur;


public interface VisiteurRepository extends CrudRepository<Visiteur, Long>{
	
	@Modifying
    @Transactional
    @Query("UPDATE Visiteur e SET e.DateLeave=:DateLeave1 where e.IdVisiteur=:VisiteurId")
    public void UpdateVisiteur(@Param("DateLeave1")Date DateLeave1, @Param("VisiteurId")Long VisiteurId);
	
	


}
