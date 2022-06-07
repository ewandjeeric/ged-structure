package org.ged;

import java.util.*;

import org.ged.dao.*;
import org.ged.entities.*;
import org.ged.service.GroupeService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableFeignClients
public class GedStructureApplication {

    public static void main(String[] args) {
        SpringApplication.run(GedStructureApplication.class, args);
    }

    @Bean
    CommandLineRunner start(StructureRepository structureRepository, PosteRepository postRepository,
                            EmployeRepositoryRest employeRepositoryRest, PosteEmployeRepository posteemployerepository,
                            AppRoleRepository approlerepository, EmployeRepository employeRepository) {
        return arg -> {
            Structure s1 = new Structure(null, "Maire", "Service du maire", null, null, null, true);
            Structure s2 = new Structure(null, "Service Courrier", "Gestion du courrier", null, s1, null, true);
            Structure s3 = new Structure(null, "Service Archivage", "Gestion des archive", null, s2, null, true);
            Set<Structure> ls1 = new HashSet<Structure>();
            ls1.add(s2);
            ls1.add(s3);
            s1.setSousStructure(ls1);
            Set<Structure> ls2 = new HashSet<Structure>();
            ls2.add(s3);
            s2.setSousStructure(ls2);

            Poste p1 = new Poste(null, "Maire", "le poste du maire", s1, null, null, null, null, null);

            // Employe e = employeRepository.findEmployeById(id);

            Poste p2 = new Poste(null, "Directeur Courrier", "Directeur courier", s2, null, p1, null, null, null);
            Employe e1 = employeRepositoryRest.findEmployeById(1);
            Employe e2 = employeRepositoryRest.findEmployeById(2);
            PosteEmploye pe1 = new PosteEmploye(null, new Date(119, 0, 16), new Date(122, 1, 30), e1, p1);

            PosteEmploye pe2 = new PosteEmploye(null, new Date(119, 4, 20), new Date(121, 11, 15), e2, p2);

            PosteEmploye pe3 = new PosteEmploye(null, new Date(122, 1, 15), null, e2, p2);

            AppRole ap1 = new AppRole(null, "Cposte", true, false, false, false);
            AppRole ap2 = new AppRole(null, "Rposte", false, true, false, false);
            AppRole ap3 = new AppRole(null, "Cstructure", true, false, false, false);

            structureRepository.save(s1);
            structureRepository.save(s2);
            structureRepository.save(s3);

            postRepository.save(p1);
            postRepository.save(p2);

            employeRepository.save(e1);
            employeRepository.save(e2);

            posteemployerepository.save(pe1);
            posteemployerepository.save(pe2);
            posteemployerepository.save(pe3);

            approlerepository.save(ap1);
            approlerepository.save(ap2);
            approlerepository.save(ap3);

        };
    }

}
