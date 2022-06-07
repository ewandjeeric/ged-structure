package org.ged.service;


import org.ged.entities.Poste;
import org.springframework.data.domain.Page;

public interface PosteService {

    public Page<Poste> allposte(String titre, int page, int size);

    public Poste getposte(long id);

    public void updateposte(Poste poste);

    public void createeposte(Poste poste);

    public void deleteposte(long id);

}
