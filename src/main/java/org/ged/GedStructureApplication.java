package org.ged;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.ged.dao.AppRoleRepository;
import org.ged.dao.EmployeRepository;
import org.ged.dao.PosteEmployeRepository;
import org.ged.dao.PosteRepository;
import org.ged.dao.StructureRepository;
import org.ged.entities.AppRole;
import org.ged.entities.Poste;
import org.ged.entities.PosteEmploye;
import org.ged.entities.Structure;
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
			EmployeRepository employeRepository, PosteEmployeRepository posteemployerepository,
			AppRoleRepository approlerepository) {
		return arg -> {
			Structure s1 = new Structure(null, "Maire", "Service du maire", null, null, null, true);
			Structure s2 = new Structure(null, "Service Courrier", "Gestion du courrier", null, s1, null, true);
			Structure s3 = new Structure(null, "Service Archivage", "Gestion des archive", null, s2, null, true);
			List<Structure> ls1 = new ArrayList<Structure>();
			ls1.add(s2);
			ls1.add(s3);
			s1.setSousStructure(ls1);
			List<Structure> ls2 = new ArrayList<Structure>();
			ls2.add(s3);
			s2.setSousStructure(ls2);

			Poste p1 = new Poste(null, "Maire", "le poste du maire", s1, null, null, null, null);

			// Employe e = employeRepository.findEmployeById(id);

			Poste p2 = new Poste(null, "Directeur Courrier", "Directeur courier", s2, null, p1, null, null);

			PosteEmploye pe1 = new PosteEmploye(null, new Date(), null, 1, p1);

			PosteEmploye pe2 = new PosteEmploye(null, new Date(), null, 2, p2);

			AppRole ap1 = new AppRole(null, "ADMIN");
			AppRole ap2 = new AppRole(null, "USER");
			AppRole ap3 = new AppRole(null, "SECRETARIAT");

			structureRepository.save(s1);
			structureRepository.save(s2);
			structureRepository.save(s3);

			postRepository.save(p1);
			postRepository.save(p2);

			posteemployerepository.save(pe1);
			posteemployerepository.save(pe2);

			approlerepository.save(ap1);
			approlerepository.save(ap2);
			approlerepository.save(ap3);

		};
	}

}
