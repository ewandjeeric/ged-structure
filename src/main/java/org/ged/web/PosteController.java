package org.ged.web;

import org.ged.bean.PosteBean;
import org.ged.entities.AppRole;
import org.ged.entities.Poste;
import org.ged.service.AppRoleService;
import org.ged.service.PosteService;
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
public class PosteController {
    @Autowired
    private PosteService posteservice;
    @Autowired
    private StructureService structureservice;
    @Autowired
    private AppRoleService appRoleService;

    @GetMapping("/postes")
    public Page<Poste> allposte(@RequestParam(name = "titre", defaultValue = "") String titre,
                                @RequestParam(name = "page", defaultValue = "0") int page,
                                @RequestParam(name = "size", defaultValue = "10") int size) {
        Page<Poste> postes = null;
        try {
            postes = posteservice.allposte(titre, page, size);
        } catch (Exception e) {
            e.getMessage();
        }

        return postes;
    }

    @GetMapping("/postes/{id}")
    public Poste getposte(@PathVariable(name = "id") Long id) {
        Poste poste = null;
        try {
            poste = posteservice.getposte(id);

        } catch (Exception e) {
            // TODO: handle exception
        }
        return poste;
    }

    @PostMapping("/postes")
    public void createposte(@RequestBody PosteBean postebean) {

        Poste poste = new Poste();

        poste.setTitre(postebean.getTitre());
        poste.setDescription(postebean.getDescription());
        poste.setStructure(structureservice.getstructure(postebean.getStructure()));
        poste.setPosteSuperieur(posteservice.getposte(postebean.getPosteSuperieur()));
        for (String role : postebean.getRoles()) {
            poste.getRoles().add(appRoleService.getrole(role));
        }


        posteservice.createeposte(poste);

    }

    @PutMapping("/postes")
    public void updateposte(@RequestBody PosteBean postebean) {

        Poste poste = new Poste();

        poste.setId(postebean.getId());
        poste.setTitre(postebean.getTitre());
        poste.setDescription(postebean.getDescription());
        poste.setStructure(structureservice.getstructure(postebean.getStructure()));
        poste.setPosteSuperieur(posteservice.getposte(postebean.getPosteSuperieur()));
        for (String role : postebean.getRoles()) {
            poste.getRoles().add(appRoleService.getrole(role));
        }

        posteservice.updateposte(poste);

    }

}
