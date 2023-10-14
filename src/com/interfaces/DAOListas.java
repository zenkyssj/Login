
package com.interfaces;

import com.models.Listas;
import java.util.List;

/**
 *
 * @author Jose Ariel
 */
public interface DAOListas {
    public void registrar(Listas user) throws Exception;
    public void mostrar(Listas user) throws Exception;
    public void modificar(Listas user) throws Exception;
    public void eliminar(Listas user) throws Exception;
    public List<Listas> listar() throws Exception;
}
