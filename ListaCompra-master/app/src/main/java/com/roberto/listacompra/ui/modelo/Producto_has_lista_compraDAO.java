package com.roberto.listacompra.ui.modelo;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface Producto_has_lista_compraDAO {
    @Insert
    public long insertarproducto_en_lista(Producto_has_lista_compra pl);

    @Update //No necesita query
    public long actualizarproducto_en_lista(Producto_has_lista_compra pl);

    //Consultas
    @Query("SELECT * FROM Producto_has_lista_compra WHERE id_lista_compra= :id_l_compra")
    public LiveData<List<Producto_has_lista_compra>> obtenerdatos_listacompra(int id_l_compra);
}
