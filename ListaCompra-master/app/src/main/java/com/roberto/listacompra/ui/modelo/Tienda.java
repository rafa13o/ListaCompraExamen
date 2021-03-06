package com.roberto.listacompra.ui.modelo;

import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;

@Entity(indices = {@Index(name="tiendaUnica", value={"nombre"}, unique = true)})
public class Tienda {
    //1.- Agregar los campos de la entidad
    @PrimaryKey(autoGenerate = true)
    private int id;
    private String nombre;
    private String descripcion;
    private String ubicacion;


    //2.- Constructor, getter y setter
    public Tienda(String nombre, String descripcion, String ubicacion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.ubicacion = ubicacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
}
