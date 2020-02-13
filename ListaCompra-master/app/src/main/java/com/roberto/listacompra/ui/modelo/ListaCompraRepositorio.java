package com.roberto.listacompra.ui.modelo;

import android.app.Application;
import android.os.AsyncTask;

import androidx.lifecycle.LiveData;

import java.util.List;

public class ListaCompraRepositorio {

    //Los DAOs
    private Lista_CompraDAO lista_compraDAO;
    private ProductoDAO productoDAO;
    private TiendaDAO tiendaDAO;
    private Producto_has_lista_compraDAO producto_has_lista_compraDAO;

//    private LiveData<List<Tienda>> listaTiendas;
//    private LiveData<List<Producto>> listaProductos;
//    private LiveData<List<Lista_Compra>> listaCompras;
//    private LiveData<List<Producto_has_lista_compra>> detalleListaCompras;

    //Constructor
    public ListaCompraRepositorio(Application app){
        this.lista_compraDAO = ListaCompraDatabase.getDatabase(app).getLista_CompraDAO();
        this.producto_has_lista_compraDAO = ListaCompraDatabase.getDatabase(app).getProductolistacompraDAO();
        this.tiendaDAO = ListaCompraDatabase.getDatabase(app).getTiendaDAO();
        this.productoDAO = ListaCompraDatabase.getDatabase(app).getProductoDAO();

        //this.listaCompras=lista_compraDAO.obtener_listas_compra();
        //this.listaProductos=productoDAO.obtener_productos();
        //this.listaTiendas=tiendaDAO.obtener_tiendas();


    }

    //Método para insertar una lista de la compra
    public void insertarListaCompra(Lista_Compra l){
        new AsyncTask<Lista_Compra, Void, Void>(){
            @Override
            protected Void doInBackground(Lista_Compra... lista_compras) {
                lista_compraDAO.nueva_lista(lista_compras[0]);
                return null;
            }
        }.execute(l);
    }

    public void insertarDetalleListaCompra (Producto_has_lista_compra detalle){
        new AsyncTask<Producto_has_lista_compra, Void, Void>(){
            @Override
            protected Void doInBackground(Producto_has_lista_compra... detalle) {
                producto_has_lista_compraDAO.insertarproducto_en_lista(detalle[0]);//detalle[0]
                return null;
            }
        }.execute(detalle);
    }

    public void actualizarDetallesListaCompra(Producto_has_lista_compra detalle){
        new AsyncTask<Producto_has_lista_compra, Void, Void>(){
            @Override
            protected Void doInBackground(Producto_has_lista_compra... detalle) {
                producto_has_lista_compraDAO.actualizarproducto_en_lista(detalle[0]);//detalle[0]
                return null;
            }
        }.execute(detalle);
    }



    public LiveData<List<Lista_Compra>> obtener_listasdelacompra(){
        return this.lista_compraDAO.obtener_listas_compra();
    }

    public LiveData<List<Producto>> obtener_listadeproductos(){
        return this.productoDAO.obtener_productos();
    }

    public LiveData<List<Tienda>> obtener_listadetiendas(){
        return this.tiendaDAO.obtener_tiendas();
    }

    public LiveData<List<Producto_has_lista_compra>> obtener_detallelistasdelacompra(int idListaCompra){
        return this.producto_has_lista_compraDAO.obtenerdatos_listacompra(idListaCompra);
    }
}
