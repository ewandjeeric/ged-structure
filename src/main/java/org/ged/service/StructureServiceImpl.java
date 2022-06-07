package org.ged.service;

import javax.transaction.Transactional;

import org.ged.dao.StructureRepository;
import org.ged.entities.Structure;
import org.ged.exception.StructureException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class StructureServiceImpl implements StructureService {

    @Autowired
    private StructureRepository structureRepo;

    @Override
    public Page<Structure> allstructure(String titre, int page, int size) {

        return structureRepo.findByTitreContaining(titre, PageRequest.of(page, size));
    }

    @Override
    public Structure getstructure(long id) throws StructureException {

        return structureRepo.findById(id).orElseThrow(() -> new StructureException(id));
    }

    @Override
    public void updatestructure(Structure structure) {
        try {
            structureRepo.save(structure);

        } catch (Exception e) {

            e.getMessage();
        }

    }

    @Override
    public void createstructure(Structure structure) {

        try {
            structureRepo.save(structure);

        } catch (Exception e) {

            e.getMessage();
        }
    }

    @Override
    public void deletestructure(long id) {

        structureRepo.delete(this.getstructure(id));

    }

}
