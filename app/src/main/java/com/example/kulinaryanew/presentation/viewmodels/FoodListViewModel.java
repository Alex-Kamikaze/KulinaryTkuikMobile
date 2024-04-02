package com.example.kulinaryanew.presentation.viewmodels;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.example.kulinaryanew.data.db.BludoCategoryEntity;
import com.example.kulinaryanew.data.db.BludoEntity;
import com.example.kulinaryanew.domain.repository.FoodRepositoryImpl;

import java.util.List;

public class FoodListViewModel extends ViewModel {
    private final FoodRepositoryImpl repository = new FoodRepositoryImpl();
    public LiveData<List<BludoEntity>> _bludosFromDb = repository.getFoodFromDb();
    public LiveData<List<BludoCategoryEntity>> _categoriesFromDb = repository.getCategoriesFromDb();

    public FoodListViewModel() {

    }
}
