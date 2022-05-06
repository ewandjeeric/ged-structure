package org.ged.dao;

import org.ged.entities.Poste;
import org.ged.entities.PosteEmploye;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface PosteEmployeRepository extends JpaRepository<PosteEmploye, Long> {
	@Query("SELECT pe FROM PosteEmploye pe WHERE pe.poste LIKE '%'||:poste||'%' OR pe.employeid LIKE '%'||:employeid||'%'")
	public PosteEmploye findByPosteOrEmployeid(@Param("poste") Poste poste, @Param("employeid") int employeid);
}
