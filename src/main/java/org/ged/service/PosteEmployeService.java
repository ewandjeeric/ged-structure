package org.ged.service;

import org.ged.entities.PosteEmploye;
import org.springframework.data.domain.Page;

import java.util.Date;
import java.util.List;

public interface PosteEmployeService {

    public Page<PosteEmploye> allposteemploye(Date date, int page, int size);

    public PosteEmploye getposteemploye(long id);

    public void createposteemploye(PosteEmploye posteemploye);

    public void updateposteemploye(PosteEmploye posteemploye);

    public List<PosteEmploye> findposteforemploye(String poste, String employeid);

}
