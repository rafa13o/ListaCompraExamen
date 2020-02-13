package com.roberto.listacompra.ui.modelo;

import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

@Entity(primaryKeys = {"id_producto", "id_lista_compra", "id_tienda"},//Claves primarias compuestas
foreignKeys = {@ForeignKey(entity = Producto.class, //Clase de la que es foreign
        parentColumns = {"id"}, //Columna a la que hace referencia
        childColumns = {"id_producto"}, //Columna en esta tabla
        onDelete = ForeignKey.CASCADE),
    @ForeignKey(entity = Lista_Compra.class,
        parentColumns = {"id"},
        childColumns = {"id_lista_compra"}),
    @ForeignKey(entity = Tienda.class,
        parentColumns = {"id"},
        childColumns = {"id_tienda"})})

public class Producto_has_lista_compra {
    //1.- Agregar los campos de la entidad
    private int id_producto;
    private int id_lista_compra;
    private int id_tienda;
    private float precio_producto;
    private int unidades_compradas;
    private int unidades_pedidas;

    //2.- Constructor, getter y setter
    public Producto_has_lista_compra(int id_producto, int id_lista_compra, int id_tienda, float precio_producto, int unidades_compradas, int unidades_pedidas) {
        this.id_producto = id_producto;
        this.id_lista_compra = id_lista_compra;
        this.id_tienda = id_tienda;
        this.precio_producto = precio_producto;
        this.unidades_compradas = unidades_compradas;
        this.unidades_pedidas = unidades_pedidas;
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public int getId_lista_compra() {
        return id_lista_compra;
    }

    public void setId_lista_compra(int id_lista_compra) {
        this.id_lista_compra = id_lista_compra;
    }

    public int getId_tienda() {
        return id_tienda;
    }

    public void setId_tienda(int id_tienda) {
        this.id_tienda = id_tienda;
    }

    public float getPrecio_producto() {
        return precio_producto;
    }

    public void setPrecio_producto(float precio_producto) {
        this.precio_producto = precio_producto;
    }

    public int getUnidades_compradas() {
        return unidades_compradas;
    }

    public void setUnidades_compradas(int unidades_compradas) {
        this.unidades_compradas = unidades_compradas;
    }

    public int getUnidades_pedidas() {
        return unidades_pedidas;
    }

    public void setUnidades_pedidas(int unidades_pedidas) {
        this.unidades_pedidas = unidades_pedidas;
    }
}
