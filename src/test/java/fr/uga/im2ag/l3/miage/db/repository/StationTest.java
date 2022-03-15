package fr.uga.im2ag.l3.miage.db.repository;
import java.sql.Date;

import static org.assertj.core.api.Assertions.assertThat;

import fr.uga.im2ag.l3.miage.db.repository.impl.StationRepositoryImpl;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
class StationTest extends Base {

    StationRepositoryImpl stationRepository;

    @BeforeEach
    void before() {
        stationRepository = (StationRepositoryImpl) daoFactory.newStationRepository(entityManager);
    }

    @AfterEach
    void after() {
        if (entityManager.getTransaction().isActive()) {
            entityManager.getTransaction().rollback();
        }
    }

    @Test
    void shouldSaveGrade() {
        // TODO
    
    	

    }

    @Test
    void shouldFailUpgradeGrade() {
        // TODO, ici tester que la mise à jour n'a pas eu lieu.


    }

}
