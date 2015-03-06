/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import entity.ProjectUser;
import java.util.Collection;

/**
 *
 * @author Afrooz
 */
public interface Facade {
    
    public ProjectUser createUser(ProjectUser pu);
    public ProjectUser findUser(int id);
    public Collection<ProjectUser> getAllUsers();
    
}
