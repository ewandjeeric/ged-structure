package org.ged.web;

import org.ged.bean.GroupeBean;
import org.ged.entities.AppRole;
import org.ged.entities.Groupe;
import org.ged.entities.Poste;
import org.ged.service.AppRoleService;
import org.ged.service.GroupeService;
import org.ged.service.PosteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@RestController
public class GroupeController {
    @Autowired
    private GroupeService groupeService;
    @Autowired
    private AppRoleService appRoleService;
    @Autowired
    private PosteService posteService;

    @GetMapping("/groupes")
    public Page<Groupe> allgroupe(
            @RequestParam(name = "nom", defaultValue = "") String nom,
            @RequestParam(name = "page", defaultValue = "0") int page,
            @RequestParam(name = "size", defaultValue = "10") int size) {
        return groupeService.allgroupe(nom, page, size);
    }

    @GetMapping("/groupes/{id}")
    public Groupe getgroupe(@PathVariable(name = "id") long id) {
        return groupeService.getgroupe(id);
    }

    @PostMapping("/groupes")
    public Groupe addgroupe(@RequestBody GroupeBean groupeBean) {

        Groupe groupe = new Groupe();
        try {
            groupe.setId(null);
            groupe.setNom(groupeBean.getNom());
            groupe.setDateCreation(new Date());

            if (groupeBean.getPoste().size() > 0) {
                for (long id : groupeBean.getPoste()) {
                    groupe.getPostes().add(posteService.getposte(id));
                }
            }
            if (groupeBean.getRole().size() > 0) {
                for (String role : groupeBean.getRole()) {
                    groupe.getRoles().add(appRoleService.getrole(role));
                }
            }

        } catch (Exception e) {
            e.getMessage();
        }
        return groupeService.addgroupe(groupe);
    }

    @PutMapping("/groupes")
    public Groupe updategroupe(
            @RequestBody GroupeBean groupeBean,
            @RequestParam(name = "postes", defaultValue = "") String postes,
            @RequestParam(name = "roles", defaultValue = "") String roles) {

        Groupe groupe = this.getgroupe(groupeBean.getId());
        try {

            groupe.setNom(groupeBean.getNom());

            if (roles.equals("") && !postes.equals("")) {
                Set ps = new HashSet<Poste>();
                for (long id : groupeBean.getPoste()) {
                    ps.add(posteService.getposte(id));
                }
                groupe.setPostes(ps);

            } else if (!roles.equals("") && postes.equals("")) {
                Set rs = new HashSet<AppRole>();
                for (String role : groupeBean.getRole()) {
                    rs.add(appRoleService.getrole(role));
                }
                groupe.setRoles(rs);
            }


        } catch (Exception e) {
            e.getMessage();
        }

        return groupeService.updategroupe(groupe, postes, roles);
    }

    @DeleteMapping("/groupes/{id}")
    public void deletegroupe(@PathVariable(name = "id", required = true) long id) {
        groupeService.deletegroupe(id);
    }

}
