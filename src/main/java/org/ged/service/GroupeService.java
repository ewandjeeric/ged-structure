package org.ged.service;

import org.ged.bean.GroupeBean;
import org.ged.entities.Groupe;
import org.springframework.data.domain.Page;

public interface GroupeService {

    public Page<Groupe> allgroupe(String nom, int page, int size);

    public Groupe getgroupe(long id);

    public Groupe addgroupe(Groupe groupe);

    public Groupe updategroupe(Groupe groupe, String postes, String roles);

    public void deletegroupe(long id);

}
