package org.ged.dao;

import org.ged.entities.Structure;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface StructureRepository extends JpaRepository<Structure, Long> {
	@Query("SELECT s FROM Structure s WHERE s.titre LIKE '%'||:titre||'%' ")
	public Page<Structure> findAll(@Param("titre") String titre, Pageable pageable);
}
