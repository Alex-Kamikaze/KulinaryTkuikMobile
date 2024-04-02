package com.example.kulinaryanew.data.repository;

import androidx.lifecycle.LiveData;

import com.example.kulinaryanew.data.db.BludoCategoryEntity;
import com.example.kulinaryanew.data.db.BludoEntity;

import java.util.List;

public interface BludoRepository {
    void insertNewBludos(BludoEntity... bludos);

    void deleteBludos(BludoEntity... bludos);

    void addNewCategories(BludoCategoryEntity... categories);

    void deleteCategories(BludoCategoryEntity... categories);

    LiveData<List<BludoEntity>> getFoodFromDb();

    LiveData<List<BludoCategoryEntity>> getCategoriesFromDb();

    LiveData<List<BludoEntity>> getFoodFromCategory(int category_id);

    BludoCategoryEntity getCategoryById(int id);
}
