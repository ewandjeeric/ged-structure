package org.ged.service;

import org.ged.entities.Structure;
import org.springframework.data.domain.Page;

public interface StructureService {

	public Page<Structure> allstructure(String titre, int page, int size);

	public Structure getstructure(long id);

	public void updatestructure(Structure structure);

	public void createstructure(Structure structure);

	public void deletestructure(long id);
}
