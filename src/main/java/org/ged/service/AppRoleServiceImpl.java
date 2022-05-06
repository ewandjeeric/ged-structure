package org.ged.service;

import javax.transaction.Transactional;

import org.ged.dao.AppRoleRepository;
import org.ged.entities.AppRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class AppRoleServiceImpl implements AppRoleService {

	@Autowired
	private AppRoleRepository approlerepository;

	@Override
	public Page<AppRole> allrole(String role, int page, int size) {
		return approlerepository.findAll(role, PageRequest.of(page, size));
	}

	@Override
	public AppRole getrole(String role) {
		return approlerepository.findByRole(role);
	}

	@Override
	public void addrole(AppRole approle) {
		try {
			approlerepository.save(approle);
		} catch (Exception e) {
			e.getMessage();
		}

	}

	@Override
	public void updaterole(AppRole approle) {
		try {
			approlerepository.save(approle);
		} catch (Exception e) {
			e.getMessage();
		}

	}

	@Override
	public void deleterole(String role) {
		approlerepository.delete(this.getrole(role));

	}

}
