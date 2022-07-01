package br.edu.iftm.organizapdf.util;

import java.io.Serializable;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

@ApplicationScoped
public class PersistenceFactory implements Serializable {

    private EntityManagerFactory emf = 
            Persistence.createEntityManagerFactory("organizapdfPU");

    @Produces
    public EntityManager getEntityManager() {
        EntityManager em = emf.createEntityManager();
        return em;
    }
}
