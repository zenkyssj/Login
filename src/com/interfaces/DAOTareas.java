
package com.interfaces;

import com.models.Tareas;
import java.util.List;

/**
 *
 * @author Jose Ariel
 */
public interface DAOTareas {
    public void registrar(Tareas user) throws Exception;
    public void modificar(Tareas user) throws Exception;
    public void eliminar(Tareas user) throws Exception;
    public List<Tareas> listar() throws Exception;
}
