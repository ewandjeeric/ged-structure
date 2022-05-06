package org.ged.dao;

import org.ged.entities.Poste;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface PosteRepository extends JpaRepository<Poste, Long> {
	@Query("SELECT p FROM Poste p WHERE p.titre LIKE '%'||:titre||'%'")
	public Poste findByTitre(@Param("titre") String titre);

	@Query("SELECT p FROM Poste p WHERE p.titre LIKE '%'||:titre||'%'")
	public Page<Poste> findAll(@Param("titre") String titre, Pageable pageable);

}
