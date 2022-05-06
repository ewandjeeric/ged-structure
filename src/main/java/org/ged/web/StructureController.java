package org.ged.web;

import org.ged.bean.StructureBean;
import org.ged.entities.Structure;
import org.ged.exception.StructureException;
import org.ged.service.StructureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StructureController {
	@Autowired
	private StructureService structureservice;

	@GetMapping("/structures")
	public Page<Structure> allStructure(@RequestParam(name = "titre", defaultValue = "") String titre,
			@RequestParam(name = "page", defaultValue = "0") int page,
			@RequestParam(name = "size", defaultValue = "10") int size) {

		Page<Structure> structures = null;

		try {

			structures = structureservice.allstructure(titre, page, size);

		} catch (Exception e) {

			e.getMessage();
		}
		return structures;
	}

	@GetMapping("/structures/{id}")
	public <Optional> Structure getStructure(@PathVariable(name = "id") Long id) throws StructureException {

		return structureservice.getstructure(id);

	}

	@PutMapping("/structures")
	public void updateStructure(@RequestBody StructureBean structurebean) {

		if (Long.valueOf(structurebean.getId()) != null) {

			Structure structure = structureservice.getstructure(structurebean.getId());

			if (structurebean.getTitre() != null) {
				structure.setTitre(structurebean.getTitre());
			}

			if (structurebean.getDescription() != null) {
				structure.setDescription(structurebean.getDescription());
			}

			if (Long.valueOf(structurebean.getStructureSuperieur()) != null) {
				structure.setStructureSuperieur(structureservice.getstructure(structurebean.getStructureSuperieur()));
			}

			structureservice.updatestructure(structure);
		}
	}

	@PostMapping("/structures")
	public void createStructure(@RequestBody StructureBean structurebean) {

		Structure structure = new Structure();
		structure.setTitre(structurebean.getTitre());
		structure.setDescription(structurebean.getDescription());

		if (Long.valueOf(structurebean.getStructureSuperieur()) != null) {
			structure.setStructureSuperieur(structureservice.getstructure(structurebean.getStructureSuperieur()));
		}

		structureservice.createstructure(structure);
	}

	@DeleteMapping("/structures/{id}")
	public void deleteStructure(@PathVariable(name = "id") Long id) {

		structureservice.deletestructure(id);
	}

}
