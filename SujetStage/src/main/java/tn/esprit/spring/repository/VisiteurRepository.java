package tn.esprit.spring.repository;

import java.time.LocalDateTime;
import java.util.Date;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import tn.esprit.spring.entities.Visiteur;

public interface VisiteurRepository extends CrudRepository<Visiteur, Long> {

	// update ta3 date khrouj
	@Modifying
	@Transactional
	@Query("UPDATE Visiteur e SET e.DateLeave=:DateLeave1 where e.IdVisiteur=:VisiteurId")
	public void UpdateVisiteur(@Param("DateLeave1") LocalDateTime DateLeave1, @Param("VisiteurId") Long VisiteurId);

	// update cursor 3al X row
	@Modifying
	@Transactional
	@Query("UPDATE Visiteur e SET e.Xrow=:Xrow1 where e.IdVisiteur=:VisiteurId")
	public void UpdateXRow(@Param("Xrow") Long Xrow, @Param("VisiteurId") Long VisiteurId);

	// update cursor 3al X row
	@Modifying
	@Transactional
	@Query("UPDATE Visiteur e SET e.Yrow=:Yrow1 where e.IdVisiteur=:VisiteurId")
	public void UpdateYRow(@Param("Yrow") Long Yrow, @Param("VisiteurId") Long VisiteurId);

}
