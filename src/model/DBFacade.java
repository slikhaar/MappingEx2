/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import entity.ProjectUser;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author Afrooz
 */
public class DBFacade implements Facade {

    static EntityManagerFactory emf;

    public DBFacade(EntityManagerFactory emf) {
        DBFacade.emf = emf;
    }

    @Override
    public ProjectUser createUser(ProjectUser p) {
        EntityManager em = null;
        try {
            em = emf.createEntityManager();
            em.getTransaction().begin();
            em.persist(p);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
        return p;
    }

    @Override
    public ProjectUser findUser(int id) {
        
        return null;
    }

    @Override
    public Collection<ProjectUser> getAllUsers() {
        return null;
    }
}
