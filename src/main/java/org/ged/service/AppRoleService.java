package org.ged.service;

import org.ged.entities.AppRole;
import org.springframework.data.domain.Page;

public interface AppRoleService {

	public Page<AppRole> allrole(String role, int page, int size);

	public AppRole getrole(String role);

	public void addrole(AppRole approle);

	public void updaterole(AppRole approle);

	public void deleterole(String role);

}
