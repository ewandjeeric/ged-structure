package org.ged.dao;

import org.ged.entities.Employe;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "GED-EMPLOYE", url = "${employes.post.baseUrl}", configuration = Employe.class)
public interface EmployeRepository {

	@GetMapping("/{id}")
	public Employe findEmployeById(@PathVariable(name = "id") Integer id);

	@GetMapping("/{name}")
	public Employe findEmployeByName(@PathVariable(name = "name") String name);
}
