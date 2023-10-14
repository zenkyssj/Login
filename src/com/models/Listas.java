
package com.models;

/**
 *
 * @author Jose Ariel
 */
public class Listas {
    private int id;
    private String nombre_lista;
    private String descripcion;
    private int usuario_id;
    private String fecha;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre_lista() {
        return nombre_lista;
    }

    public void setNombre_lista(String nombre_lista) {
        this.nombre_lista = nombre_lista;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getUsuario_id() {
        return usuario_id;
    }

    public void setUsuario_id(int usuario_id) {
        this.usuario_id = usuario_id;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
}
