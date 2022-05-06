package org.ged.service;

import javax.transaction.Transactional;

import org.ged.bean.PosteRoleBean;
import org.ged.dao.AppRoleRepository;
import org.ged.dao.PosteRepository;
import org.ged.entities.AppRole;
import org.ged.entities.Poste;
import org.ged.exception.PosteException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class PosteServiceImpl implements PosteService {

	@Autowired
	private PosteRepository posterepo;

	@Autowired
	private AppRoleRepository approlerepository;

	@Override
	public Page<Poste> allposte(String titre, int page, int size) {
		return posterepo.findAll(titre, PageRequest.of(page, size));
	}

	@Override
	public Poste getposte(long id) {

		Poste poste = posterepo.findById(id).orElseThrow(() -> new PosteException(id));

		return poste;
	}

	@Override
	public void updateposte(Poste poste) {
		try {
			posterepo.save(poste);

		} catch (Exception e) {
			e.getMessage();
		}

	}

	@Override
	public void createeposte(Poste poste) {
		try {
			posterepo.save(poste);

		} catch (Exception e) {
			e.getMessage();
		}

	}

	@Override
	public void deleteposte(long id) {
		try {
			posterepo.delete(this.getposte(id));
			;

		} catch (Exception e) {
			e.getMessage();
		}

	}

	@Override
	public void addroleposte(PosteRoleBean posterolebean) {

		Poste poste = this.getposte(posterolebean.getPoste());
		AppRole approle = approlerepository.findByRole(posterolebean.getRole());
		poste.getRoles().add(approle);

	}

	@Override
	public void deleteroleposte(PosteRoleBean posterolebean) {

		Poste poste = this.getposte(posterolebean.getPoste());
		AppRole approle = approlerepository.findByRole(posterolebean.getRole());
		poste.getRoles().remove(approle);

	}

}
