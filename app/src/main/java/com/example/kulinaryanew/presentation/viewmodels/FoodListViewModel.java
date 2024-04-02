package com.example.kulinaryanew.presentation.viewmodels;

import androidx.annotation.NonNull;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.ViewModel;


import com.example.kulinaryanew.BludoApplication;
import com.example.kulinaryanew.R;
import com.example.kulinaryanew.data.db.AppDatabase;
import com.example.kulinaryanew.data.db.BludoCategoryEntity;
import com.example.kulinaryanew.data.db.BludoEntity;
import com.example.kulinaryanew.domain.mappers.FoodMapper;
import com.example.kulinaryanew.domain.models.BludoModel;
import com.example.kulinaryanew.domain.repository.FoodRepositoryImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

import kotlin.jvm.functions.Function1;

public class FoodListViewModel extends ViewModel {
    private final FoodRepositoryImpl repository = new FoodRepositoryImpl();
    private final AppDatabase db = BludoApplication.getInstance().getDb();
    private final LiveData<List<BludoEntity>> _bludosFromDb = repository.getFoodFromDb();

    //private final MutableLiveData<List<BludoModel>> _bludos = new MutableLiveData<>(new ArrayList<>());

    public LiveData<List<BludoModel>> bludos = Transformations.map(_bludosFromDb, bludoEntities -> {
        ArrayList<BludoModel> food = new ArrayList<>();
        bludoEntities.forEach(bludoEntity -> {
            String categoryName = repository.getCategoryById(bludoEntity.getCategoryId()).getCategoryName();
            food.add(FoodMapper.fromBludoEntity(bludoEntity, categoryName));
        });
        return food;
    });
}

