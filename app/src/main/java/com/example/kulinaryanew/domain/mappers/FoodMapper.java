package com.example.kulinaryanew.domain.mappers;

import com.example.kulinaryanew.data.db.BludoCategoryEntity;
import com.example.kulinaryanew.data.db.BludoEntity;
import com.example.kulinaryanew.domain.models.BludoModel;

public class FoodMapper {
    public static BludoModel fromBludoEntity(BludoEntity entity, BludoCategoryEntity category) {
        return new BludoModel(entity.getBludoName(), category.getCategoryName(), entity.getBludoPhoto());
    }

    /*public static BludoEntity fromBludoModel(BludoModel model) {

    }*/
}
