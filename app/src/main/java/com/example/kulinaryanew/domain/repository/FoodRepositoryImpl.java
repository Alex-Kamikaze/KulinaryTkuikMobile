package com.example.kulinaryanew.domain.repository;

import androidx.lifecycle.LiveData;

import com.example.kulinaryanew.BludoApplication;
import com.example.kulinaryanew.data.db.AppDatabase;
import com.example.kulinaryanew.data.db.BludoCategoryEntity;
import com.example.kulinaryanew.data.db.BludoDao;
import com.example.kulinaryanew.data.db.BludoEntity;
import com.example.kulinaryanew.data.db.CategoryDao;
import com.example.kulinaryanew.data.repository.BludoRepository;

import java.util.List;

public class FoodRepositoryImpl implements BludoRepository {
    private final AppDatabase db = BludoApplication.getInstance().getDb();
    private final BludoDao foodDao = db.getBludoDao();
    private final CategoryDao categoryDao = db.getCategoryDao();

    public FoodRepositoryImpl() {
    }

    @Override
    public void insertNewBludos(BludoEntity... bludos) {
        foodDao.insertAndUpdateBludos(bludos);
    }

    @Override
    public void deleteBludos(BludoEntity... bludos) {
        foodDao.deleteBludos(bludos);
    }

    @Override
    public void addNewCategories(BludoCategoryEntity... categories) {
        categoryDao.insertAndUpdateCategories(categories);
    }

    @Override
    public void deleteCategories(BludoCategoryEntity... categories) {
        categoryDao.deleteCategories(categories);
    }

    @Override
    public LiveData<List<BludoEntity>> getFoodFromDb() {
        return foodDao.getAllBludosFromDb();
    }

    @Override
    public LiveData<List<BludoCategoryEntity>> getCategoriesFromDb() {
        return categoryDao.getAllCategories();
    }

    @Override
    public LiveData<List<BludoEntity>> getFoodFromCategory(int category_id) {
        return foodDao.getBludoFromCategory(category_id);
    }

    @Override
    public BludoCategoryEntity getCategoryById(int id) {
        return categoryDao.getCategoryById(id);
    }
}
