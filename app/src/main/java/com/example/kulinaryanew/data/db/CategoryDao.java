package com.example.kulinaryanew.data.db;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Query;
import androidx.room.Upsert;

import java.util.List;

@Dao
public interface CategoryDao {

    @Upsert
    void insertAndUpdateCategories(BludoCategoryEntity... categories);

    @Delete
    void deleteCategories(BludoCategoryEntity... categories);

    @Query("SELECT * FROM BludoCategoryEntity")
    LiveData<List<BludoCategoryEntity>> getAllCategories();

    @Query("SELECT * FROM BludoCategoryEntity WHERE CategoryId = :id")
    LiveData<BludoCategoryEntity> getCategoryById(int id);

}
