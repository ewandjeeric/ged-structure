package org.ged.web;

import org.ged.entities.AppRole;
import org.ged.service.AppRoleService;
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
public class AppRoleController {

	@Autowired
	private AppRoleService approleservice;

	@GetMapping("/approle")
	public Page<AppRole> allrole(@RequestParam(name = "role", defaultValue = "") String role,
			@RequestParam(name = "page", defaultValue = "0") int page,
			@RequestParam(name = "size", defaultValue = "10") int size) {
		Page<AppRole> approles = null;
		try {
			approles = approleservice.allrole(role, page, size);
		} catch (Exception e) {
			e.getMessage();
		}

		return approles;
	}

	@GetMapping("/approle/{id}")
	public AppRole getrole(@PathVariable(name = "id") String role) {
		AppRole approle = null;
		try {
			approle = approleservice.getrole(role);

		} catch (Exception e) {
			// TODO: handle exception
		}
		return approle;
	}

	@PostMapping("/approle")
	public void createrole(@RequestBody AppRole approle) {
		approleservice.addrole(approle);
	}

	@PutMapping("/approle")
	public void updaterole(@RequestBody AppRole approle) {
		approleservice.addrole(approle);
	}

	@DeleteMapping("/approle")
	public void deleterole(@RequestBody AppRole approle) {
		approleservice.deleterole(approle.getRole());
	}
}
