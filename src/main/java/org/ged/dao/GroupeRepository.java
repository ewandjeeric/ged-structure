package org.ged.dao;

import org.ged.entities.Groupe;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GroupeRepository extends JpaRepository<Groupe, Long> {
    public Page<Groupe> findByNomContaining(String nom, Pageable pageable);
}
