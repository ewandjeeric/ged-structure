package org.ged.dao;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class StructureRepositoryTest {
    /**
     * Method under test: {@link StructureRepository#findByTitreContaining(String, org.springframework.data.domain.Pageable)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testFindByTitreContaining() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //   In order to prevent findByTitreContaining(String, Pageable)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   findByTitreContaining(String, Pageable).
        //   See https://diff.blue/R013 to resolve this issue.

        StructureRepository structureRepository = null;
        structureRepository.findByTitreContaining("foo", null);
    }
}

