package com.example.kulinaryanew.domain.models;

public class BludoModel {
    private String BludoName;
    private String Category;
    private int BludoPhoto; //В бд будет хранится индентификатор из ресурсов
    private int BludoPrice;

    public BludoModel(String bludoName, String category, int bludoPhoto, int bludoPrice) {
        BludoName = bludoName;
        Category = category;
        BludoPhoto = bludoPhoto;
        BludoPrice = bludoPrice;
    }

    public int getBludoPrice() {
        return BludoPrice;
    }

    public void setBludoPrice(int bludoPrice) {
        BludoPrice = bludoPrice;
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
