package org.ged.dao;

import org.ged.entities.Structure;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface StructureRepository extends JpaRepository<Structure, Long> {
    public Page<Structure> findByTitreContaining(String titre, Pageable pageable);
}
