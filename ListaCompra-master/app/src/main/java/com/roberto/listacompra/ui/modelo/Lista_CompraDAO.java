package com.roberto.listacompra.ui.modelo;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface Lista_CompraDAO {
    @Insert
    public long nueva_lista(Lista_Compra l);

    //Consultas
    @Query("SELECT * FROM Lista_compra")
    public LiveData<List<Lista_Compra>> obtener_listas_compra();
}
