package com.example.kulinaryanew.data.db;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class BludoCategoryEntity {
    @PrimaryKey(autoGenerate = true)
    private int CategoryId;
    private String CategoryName;


    public BludoCategoryEntity(int categoryId, String categoryName) {
        CategoryId = categoryId;
        CategoryName = categoryName;
    }

    public BludoCategoryEntity() {}

    public int getCategoryId() {
        return CategoryId;
    }

    public void setCategoryId(int categoryId) {
        CategoryId = categoryId;
    }

    public String getCategoryName() {
        return CategoryName;
    }

    public void setCategoryName(String categoryName) {
        CategoryName = categoryName;
    }
}
