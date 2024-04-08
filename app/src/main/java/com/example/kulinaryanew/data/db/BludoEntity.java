package com.example.kulinaryanew.data.db;

import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

@Entity(foreignKeys = {@ForeignKey(
        entity = BludoCategoryEntity.class,
        parentColumns = {"CategoryId"},
        childColumns = {"CategoryId"},
        onDelete = ForeignKey.CASCADE
)})
public class BludoEntity {
    @PrimaryKey(autoGenerate = true)
    private int BludoId;
    private String BludoName;
    private int CategoryId;
    private String BludoImageUri;
    private int BludoPrice;

    public BludoEntity(int bludoId, String bludoName, int categoryId, String bludoImageUri, int bludoPrice) {
        BludoId = bludoId;
        BludoName = bludoName;
        CategoryId = categoryId;
        BludoImageUri = bludoImageUri;
        BludoPrice = bludoPrice;
    }

    public int getBludoId() {
        return BludoId;
    }

    public void setBludoId(int bludoId) {
        BludoId = bludoId;
    }

    public String getBludoName() {
        return BludoName;
    }

    public void setBludoName(String bludoName) {
        BludoName = bludoName;
    }

    public int getCategoryId() {
        return CategoryId;
    }

    public void setCategoryId(int categoryId) {
        CategoryId = categoryId;
    }

    public String getBludoImageUri() {
        return BludoImageUri;
    }

    public void setBludoImageUri(String bludoImageUri) {
        BludoImageUri = bludoImageUri;
    }

    public int getBludoPrice() {
        return BludoPrice;
    }

    public void setBludoPrice(int bludoPrice) {
        BludoPrice = bludoPrice;
    }

    public BludoEntity() {}
}