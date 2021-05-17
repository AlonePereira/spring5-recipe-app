package guru.springframework.repositories;

import guru.springframework.domain.UnitOfMeasure;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@DataJpaTest
public class UnitOfMeasureRepositoryIT {

    @Autowired
    UnitOfMeasureRepository repository;

    @Test
    public void findByDescription() {
        Optional<UnitOfMeasure> uomOpt = repository.findByDescription("Teaspoon");

        assertEquals("Teaspoon", uomOpt.get().getDescription());
    }

    @Test
    public void findByDescriptionCup() {
        Optional<UnitOfMeasure> uomOpt = repository.findByDescription("Cup");

        assertEquals("Cup", uomOpt.get().getDescription());
    }

}