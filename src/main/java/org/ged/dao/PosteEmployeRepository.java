package org.ged.dao;

import org.ged.entities.Poste;
import org.ged.entities.PosteEmploye;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;

public interface PosteEmployeRepository extends JpaRepository<PosteEmploye, Long> {
    @Query(value = "SELECT pe FROM PosteEmploye pe WHERE pe.poste.titre LIKE %:poste%")
    public List<PosteEmploye> findByPoste(String poste);

    @Query(value = "SELECT pe FROM PosteEmploye pe WHERE pe.employe.employeName LIKE %:employeName%")
    public List<PosteEmploye> findByEmploye(String employeName);

    public Page<PosteEmploye> findByDateAffectationAfter(Date date, Pageable pageable);

}
