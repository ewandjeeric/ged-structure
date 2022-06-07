package org.ged.dao;

import org.ged.entities.AppRole;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface AppRoleRepository extends JpaRepository<AppRole, Long> {

    public AppRole findByRoleEquals(String role);

    public Page<AppRole> findByRoleContaining(String role, Pageable pageable);

}
