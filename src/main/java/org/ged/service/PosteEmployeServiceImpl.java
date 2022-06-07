package org.ged.service;

import javax.transaction.Transactional;

import org.ged.dao.EmployeRepository;
import org.ged.dao.EmployeRepositoryRest;
import org.ged.dao.PosteEmployeRepository;
import org.ged.dao.PosteRepository;
import org.ged.entities.Employe;
import org.ged.entities.PosteEmploye;
import org.ged.exception.PosteEmployeException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
@Transactional
public class PosteEmployeServiceImpl implements PosteEmployeService {

    @Autowired
    private PosteEmployeRepository posteemployerepo;
    @Autowired
    private EmployeRepositoryRest employeRepositoryRest;
    @Autowired
    private EmployeRepository employeRepository;

    @Override
    public Page<PosteEmploye> allposteemploye(Date date, int page, int size) {

        return posteemployerepo.findByDateAffectationAfter(date, PageRequest.of(page, size, Sort.by("dateAffectation").descending()));
    }

    @Override
    public PosteEmploye getposteemploye(long id) {

        PosteEmploye posteemploye = posteemployerepo.findById(id).orElseThrow(() -> new PosteEmployeException(id));


        return posteemploye;
    }

    @Override
    public void createposteemploye(PosteEmploye posteemploye) {

        try {
            if (employeRepository.findById(posteemploye.getEmploye().getEmployeId()) == null) {
                Employe e = employeRepositoryRest.findEmployeById(posteemploye.getEmploye().getEmployeId());
                employeRepository.save(e);
            }
            posteemployerepo.save(posteemploye);
        } catch (Exception e) {
            e.getMessage();
        }

    }

    @Override
    public void updateposteemploye(PosteEmploye posteemploye) {
        try {
            if (employeRepository.findById(posteemploye.getEmploye().getEmployeId()) == null) {
                Employe e = employeRepositoryRest.findEmployeById(posteemploye.getEmploye().getEmployeId());
                employeRepository.save(e);
            }
            posteemployerepo.save(posteemploye);
        } catch (Exception e) {
            e.getMessage();
        }

    }

    @Override
    public List<PosteEmploye> findposteforemploye(String poste, String employe) {

        List<PosteEmploye> posteemploye = null;


        if (employe.equals("")) {

            posteemploye = posteemployerepo.findByPoste(poste);


        } else if (poste.equals("")) {
            posteemploye = posteemployerepo.findByEmploye(employe);

        } else {
            posteemploye = null;
        }

        return posteemploye;
    }

}
