package com.roberto.listacompra.ui.modelo;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.Date;


@Entity //Entidad (ROOM)
public class Lista_Compra {
    //1.- Agregar los campos de la entidad
    @PrimaryKey(autoGenerate = true) //Clave primaria autogenerada
    private int id;
    private Date fecha;
    private String descripcion;
    private float importe;

    //2.- Constructor, getter y setter

    public Lista_Compra(Date fecha, String descripcion, float importe) {
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.importe = importe;
    }


    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getImporte() {
        return importe;
    }

    public void setImporte(float importe) {
        this.importe = importe;
    }
}
