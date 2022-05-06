package org.ged.dao;

import org.ged.entities.AppRole;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface AppRoleRepository extends JpaRepository<AppRole, Long> {
	@Query("SELECT r FROM AppRole r WHERE r.role LIKE '%'||:role||'%'")
	public AppRole findByRole(@Param("role") String role);

	@Query("SELECT r FROM AppRole r WHERE r.role LIKE '%'||:role||'%'")
	public Page<AppRole> findAll(@Param("role") String role, Pageable pageable);

}
