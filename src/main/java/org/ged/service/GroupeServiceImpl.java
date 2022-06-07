package org.ged.service;


import org.ged.dao.GroupeRepository;
import org.ged.entities.Groupe;
import org.ged.exception.GroupeException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;


@Service
@Transactional
public class GroupeServiceImpl implements GroupeService {
    @Autowired
    private GroupeRepository groupeRepository;


    @Override
    public Page<Groupe> allgroupe(String nom, int page, int size) {
        return groupeRepository.findByNomContaining(nom, PageRequest.of(page, size, Sort.by("id").descending()));
    }

    @Override
    public Groupe getgroupe(long id) {
        return groupeRepository.findById(id).orElseThrow(() -> new GroupeException(id));
    }

    @Override
    public Groupe addgroupe(Groupe groupe) {
        return groupeRepository.save(groupe);
    }

    @Override
    public Groupe updategroupe(Groupe groupe, String postes, String roles) {
        return groupeRepository.save(groupe);
    }

    @Override
    public void deletegroupe(long id) {
        try {
            groupeRepository.delete(this.getgroupe(id));
        } catch (Exception e) {
            e.getMessage();
        }
    }
}
