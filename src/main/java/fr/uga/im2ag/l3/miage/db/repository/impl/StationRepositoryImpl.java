package fr.uga.im2ag.l3.miage.db.repository.impl;


import fr.uga.im2ag.l3.miage.db.repository.api.StationRepository;

import javax.persistence.EntityManager;

public class StationRepositoryImpl  extends BaseRepositoryImpl implements StationRepository {


    /**
     * Build a base repository
     *
     * @param entityManager the entity manager
     */
    public StationRepositoryImpl(EntityManager entityManager) {
        super(entityManager);
    }
}
