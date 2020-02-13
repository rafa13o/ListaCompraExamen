package com.roberto.listacompra.ui.modelo;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {Producto.class, Tienda.class, Lista_Compra.class, Producto_has_lista_compra.class},
        version = 1,
        exportSchema = false)//Entidades (tablas) de la Base de Datos
public abstract class ListaCompraDatabase extends RoomDatabase {
    private static ListaCompraDatabase INSTANCIA;

    public abstract TiendaDAO getTiendaDAO(); //Los desarrolla ROOM
    public abstract ProductoDAO getProductoDAO(); //Los desarrolla ROOM
    public abstract Lista_CompraDAO getLista_CompraDAO();  //Los desarrolla ROOM
    public abstract Producto_has_lista_compraDAO getProductolistacompraDAO();  //Los desarrolla ROOM


    static synchronized ListaCompraDatabase getDatabase(final Context micontexto){
        if(INSTANCIA==null){
            //Instanciamos el objeto una sola vez
            INSTANCIA= Room.databaseBuilder(micontexto.getApplicationContext(), ListaCompraDatabase.class, "ListaCompra").build();
            //...Builder(contexto,  clase (esta),  nombre de la base de datos(el que queramos).build();
        }
        return INSTANCIA;
    }


}
