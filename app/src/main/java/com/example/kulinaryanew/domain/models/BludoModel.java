package com.example.kulinaryanew.domain.models;

public class BludoModel {
    private String BludoName;
    private String Category;
    private String BludoImageUri; //В бд будет хранится индентификатор из ресурсов
    private int BludoPrice;

    public BludoModel(String bludoName, String category, String bludoImageUri, int bludoPrice) {
        BludoName = bludoName;
        Category = category;
        BludoImageUri = bludoImageUri;
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
}
