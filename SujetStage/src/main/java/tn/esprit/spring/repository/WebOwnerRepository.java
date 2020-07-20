package tn.esprit.spring.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import tn.esprit.spring.entities.WebOwner;

public interface WebOwnerRepository extends CrudRepository<WebOwner, Long>{
	
	@Modifying
    @Transactional
    @Query("UPDATE WebOwner e SET e.SiteWeb=:SiteWeb1 where e.IdWebOwner=:WebOwnerId")
    public void UpdateSiteWeb(@Param("SiteWeb1")String SiteWeb1, @Param("WebOwnerId")Long WebOwnerId);
	
	@Modifying
    @Transactional
    @Query("UPDATE WebOwner e SET e.visited=visited+1 where e.IdWebOwner=:WebOwnerId")
    public void UpdateVisited(@Param("WebOwnerId")Long WebOwnerId);

}
