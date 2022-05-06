package org.ged.web;

import org.ged.bean.PosteEmployeBean;
import org.ged.entities.PosteEmploye;
import org.ged.service.PosteEmployeService;
import org.ged.service.PosteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PosteEmployeController {
	@Autowired
	private PosteEmployeService posteemployeservice;
	@Autowired
	private PosteService posteservice;

	@GetMapping("/posteemployes")
	public Page<PosteEmploye> allposteemploye(@RequestParam(name = "page", defaultValue = "0") int page,
			@RequestParam(name = "size", defaultValue = "10") int size) {
		Page<PosteEmploye> posteemploye = null;
		try {
			posteemploye = posteemployeservice.allposteemploye(page, size);
		} catch (Exception e) {
			e.getMessage();
		}

		return posteemploye;
	}

	@GetMapping("/posteemployes/{id}")
	public PosteEmploye getposteemploye(@PathVariable(name = "id") Long id) {
		PosteEmploye posteemploye = null;
		try {
			posteemploye = posteemployeservice.getposteemploye(id);

		} catch (Exception e) {
			// TODO: handle exception
		}
		return posteemploye;
	}

	@GetMapping("/posteemploye")
	public PosteEmploye getposteforemploye(@RequestParam(name = "poste", defaultValue = "") String poste,
			@RequestParam(name = "employe", defaultValue = "") String employe) {
		PosteEmploye posteemploye = null;
		try {
			posteemploye = posteemployeservice.findposteforemploye(poste, employe);

		} catch (Exception e) {
			// TODO: handle exception
		}
		return posteemploye;
	}

	@PostMapping("/posteemploye")
	public void createposteemploye(@RequestBody PosteEmployeBean posteemployebean) {

		PosteEmploye posteemploye = new PosteEmploye();

		posteemploye.setDateAffectation(posteemployebean.getDateAffectation());
		posteemploye.setEmployeid(posteemployebean.getEmployeid());
		posteemploye.setPoste(posteservice.getposte(posteemployebean.getPoste()));
		posteemploye.setDateDepart(posteemployebean.getDateDepart());

		posteemployeservice.createposteemploye(posteemploye);

	}

	@PutMapping("/posteemploye")
	public void updateposteemploye(@RequestBody PosteEmployeBean posteemployebean) {

		PosteEmploye posteemploye = posteemployeservice.getposteemploye(posteemployebean.getId());

		posteemploye.setDateAffectation(posteemployebean.getDateAffectation());
		posteemploye.setPoste(posteservice.getposte(posteemployebean.getPoste()));
		posteemploye.setEmployeid(posteemployebean.getEmployeid());
		posteemploye.setDateDepart(posteemployebean.getDateDepart());

		posteemployeservice.updateposteemploye(posteemploye);

	}

}
