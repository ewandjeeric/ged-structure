package org.ged.service;

import org.ged.entities.PosteEmploye;
import org.springframework.data.domain.Page;

public interface PosteEmployeService {

	public Page<PosteEmploye> allposteemploye(int page, int size);

	public PosteEmploye getposteemploye(long id);

	public void createposteemploye(PosteEmploye posteemploye);

	public void updateposteemploye(PosteEmploye posteemploye);

	public PosteEmploye findposteforemploye(String poste, String employeid);

}
