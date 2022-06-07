package org.ged.web;

import org.ged.bean.PosteEmployeBean;
import org.ged.entities.Employe;
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


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
public class PosteEmployeController {
    @Autowired
    private PosteEmployeService posteemployeservice;
    @Autowired
    private PosteService posteservice;

    @GetMapping("/posteemployes")
    public Page<PosteEmploye> allposteemploye(
            @RequestParam(name = "dateAffectation", defaultValue = "") String dateAffectation,
            @RequestParam(name = "page", defaultValue = "0") int page,
            @RequestParam(name = "size", defaultValue = "10") int size) {
        Page<PosteEmploye> posteemploye = null;

        Date date = null;

        try {
            if (dateAffectation.equals("")) {
                String sDate1 = "2000-10-05";
                date = new SimpleDateFormat("yyyy-MM-dd").parse(sDate1);
            } else {
                date = new SimpleDateFormat("yyyy-MM-dd").parse(dateAffectation);
            }

            posteemploye = posteemployeservice.allposteemploye(date, page, size);

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
    public List<PosteEmploye> getposteforemploye(@RequestParam(name = "poste", defaultValue = "") String poste,
                                                 @RequestParam(name = "employe", defaultValue = "") String employe) {
        List<PosteEmploye> posteemploye = null;
        try {
            posteemploye = posteemployeservice.findposteforemploye(poste, employe);

        } catch (Exception e) {
            // TODO: handle exception
        }
        return posteemploye;
    }

    @PostMapping("/posteemployes")
    public void createposteemploye(@RequestBody PosteEmployeBean posteemployebean) {

        PosteEmploye posteemploye = new PosteEmploye();
        Employe e = new Employe(posteemployebean.getEmployeid());

        posteemploye.setDateAffectation(posteemployebean.getDateAffectation());
        posteemploye.setEmploye(e);
        posteemploye.setPoste(posteservice.getposte(posteemployebean.getPoste()));
        posteemploye.setDateDepart(posteemployebean.getDateDepart());

        posteemployeservice.createposteemploye(posteemploye);

    }

    @PutMapping("/posteemployes")
    public void updateposteemploye(@RequestBody PosteEmployeBean posteemployebean) {

        PosteEmploye posteemploye = posteemployeservice.getposteemploye(posteemployebean.getId());
        Employe e = new Employe(posteemployebean.getEmployeid());

        posteemploye.setDateAffectation(posteemployebean.getDateAffectation());
        posteemploye.setPoste(posteservice.getposte(posteemployebean.getPoste()));
        posteemploye.setEmploye(e);
        posteemploye.setDateDepart(posteemployebean.getDateDepart());

        posteemployeservice.updateposteemploye(posteemploye);

    }

}
