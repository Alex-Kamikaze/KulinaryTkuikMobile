package com.example.kulinaryanew.data.db;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Query;
import androidx.room.Upsert;

import java.util.List;

@Dao
public interface BludoDao {
    //LiveData нужна чтоб делать асинхронные операции чтения
    @Upsert
    void insertAndUpdateBludos(BludoEntity... bludos);

    @Delete
    void deleteBludos(BludoEntity... bludos);

    @Query("SELECT * FROM BludoEntity")
    LiveData<List<BludoEntity>> getAllBludosFromDb();

    @Query("SELECT * FROM BludoEntity WHERE BludoId = :id")
    LiveData<BludoEntity> getBludoById(int id);

    @Query("SELECT * FROM BludoEntity WHERE CategoryId = :category")
    LiveData<List<BludoEntity>> getBludoFromCategory(int category);
}
