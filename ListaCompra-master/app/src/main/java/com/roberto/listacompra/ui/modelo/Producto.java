package com.roberto.listacompra.ui.modelo;

import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;

@Entity(indices = {@Index(name="pdtoUnico",value={"nombre"}, unique=true)}) //Para que el nombre sea unico
public class Producto {
    //1.- Agregar los campos de la entidad
    @PrimaryKey(autoGenerate = true)
    private int id;
    private String nombre;
    private String descripcion;
    private String cod_barras;
    private String foto;
    private int stock;


    //2.- Constructor, getter y setter
    public Producto(String nombre, String descripcion, String cod_barras, String foto, int stock) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.cod_barras = cod_barras;
        this.foto = foto;
        this.stock = stock;
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

    public String getCod_barras() {
        return cod_barras;
    }

    public void setCod_barras(String cod_barras) {
        this.cod_barras = cod_barras;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
