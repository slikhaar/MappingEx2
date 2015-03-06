
package test;

import entity.Project;
import entity.ProjectUser;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import model.DBFacade;
import model.Facade;

public class Tester {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("MappingEx2PU");
        Facade f = new DBFacade(emf);
        
        ProjectUser p = new ProjectUser();
        p.setUserName("Anders");
        f.createUser(p);
       
    }

}
