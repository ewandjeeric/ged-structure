package org.ged.service;

import javax.transaction.Transactional;

import org.ged.dao.EmployeRepository;
import org.ged.dao.PosteEmployeRepository;
import org.ged.dao.PosteRepository;
import org.ged.entities.Employe;
import org.ged.entities.PosteEmploye;
import org.ged.exception.PosteEmployeException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class PosteEmployeServiceImpl implements PosteEmployeService {

	@Autowired
	private PosteEmployeRepository posteemployerepo;
	@Autowired
	private EmployeRepository employerepository;
	@Autowired
	private PosteRepository posterepository;

	@Override
	public Page<PosteEmploye> allposteemploye(int page, int size) {

		return posteemployerepo.findAll(PageRequest.of(page, size));
	}

	@Override
	public PosteEmploye getposteemploye(long id) {

		PosteEmploye posteemploye = posteemployerepo.findById(id).orElseThrow(() -> new PosteEmployeException(id));
		posteemploye.setEmploye(employerepository.findEmployeById(posteemploye.getEmployeid()));

		return posteemploye;
	}

	@Override
	public void createposteemploye(PosteEmploye posteemploye) {

		try {
			posteemployerepo.save(posteemploye);
		} catch (Exception e) {
			e.getMessage();
		}

	}

	@Override
	public void updateposteemploye(PosteEmploye posteemploye) {
		try {
			posteemployerepo.save(posteemploye);
		} catch (Exception e) {
			e.getMessage();
		}

	}

	@Override
	public PosteEmploye findposteforemploye(String poste, String employe) {

		PosteEmploye posteemploye = null;

		Employe e = employerepository.findEmployeByName(employe);
		if (Integer.valueOf(e.getEmployeId()) == null) {
			e.setEmployeId(0);

			posteemploye = posteemployerepo.findByPosteOrEmployeid(posterepository.findByTitre(poste),
					e.getEmployeId());

			posteemploye.setEmploye(employerepository.findEmployeById(posteemploye.getEmployeid()));

		} else {

			posteemploye = posteemployerepo.findByPosteOrEmployeid(posterepository.findByTitre(poste),
					e.getEmployeId());
			posteemploye.setEmploye(e);

		}

		return posteemploye;
	}

}
