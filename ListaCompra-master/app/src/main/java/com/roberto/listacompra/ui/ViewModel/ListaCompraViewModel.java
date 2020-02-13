package com.roberto.listacompra.ui.ViewModel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.roberto.listacompra.ui.modelo.ListaCompraRepositorio;
import com.roberto.listacompra.ui.modelo.Lista_Compra;
import com.roberto.listacompra.ui.modelo.Producto;
import com.roberto.listacompra.ui.modelo.Producto_has_lista_compra;
import com.roberto.listacompra.ui.modelo.Tienda;

import java.util.List;

public class ListaCompraViewModel extends AndroidViewModel {
    //Objeto que haga referencia al repositorio
    //Objetos LiveData que hagan referencia a los resultados de las consultas
    private ListaCompraRepositorio repositorio;
    private LiveData<List<Tienda>> tiendas;
    private LiveData<List<Producto>> productos;
    private LiveData<List<Lista_Compra>> listas_compra;


    //Constructor que recibe la Applicaction como parametro, instancia el repositorio y los LiveData

    public ListaCompraViewModel(@NonNull Application application) {
        super(application);
        //Instanciamos el objeto repositorio
        repositorio = new ListaCompraRepositorio(application);
        //Instanciamos los LiveData
        this.listas_compra = repositorio.obtener_listasdelacompra();
        this.productos = repositorio.obtener_listadeproductos();
        this.tiendas = repositorio.obtener_listadetiendas();
    }

    public LiveData<List<Tienda>> getTiendas() {
        return tiendas;
    }

    public LiveData<List<Producto>> getProductos() {
        return productos;
    }

    public LiveData<List<Lista_Compra>> getListas_compra() {
        return listas_compra;
    }

    public LiveData<List<Producto_has_lista_compra>> getDetalles_listacompra(int id) {
        return repositorio.obtener_detallelistasdelacompra(id);
    }


    //Métodos para cada una de las operaciones

}
