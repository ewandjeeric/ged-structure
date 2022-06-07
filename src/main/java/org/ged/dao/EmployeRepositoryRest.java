package org.ged.dao;

import org.ged.entities.Employe;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "GED-EMPLOYE", url = "${employes.post.baseUrl}")
public interface EmployeRepositoryRest {

    @GetMapping("/employe/{id}")
    public Employe findEmployeById(@PathVariable("id") Integer id);

    @GetMapping("/employesName/{name}")
    public List<Employe> findEmployeByName(@PathVariable("name") String name);
}
