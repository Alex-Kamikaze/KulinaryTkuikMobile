package com.example.kulinaryanew.domain.models;

public class BludoModel {
    private String BludoName;
    private String Category;
    private int BludoPhoto; //В бд будет хранится индентификатор из ресурсов

    public BludoModel(String bludoName, String category, int bludoPhoto) {
        BludoName = bludoName;
        Category = category;
        BludoPhoto = bludoPhoto;
    }

    public String getBludoName() {
        return BludoName;
    }

    public void setBludoName(String bludoName) {
        BludoName = bludoName;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }

    public int getBludoPhoto() {
        return BludoPhoto;
    }

    public void setBludoPhoto(int bludoPhoto) {
        BludoPhoto = bludoPhoto;
    }
}
