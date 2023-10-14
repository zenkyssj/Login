
package com.interfaces;

import com.models.Users;
import java.util.List;

/**
 *
 * @author Jose Ariel
 */
public interface DAOUsers {
    public void registrar(Users user) throws Exception;
    public boolean acceder(Users user) throws Exception;
    public void modificar(Users user) throws Exception;
    public void eliminar(Users user) throws Exception;
    public List<Users> listar() throws Exception;
    
}
