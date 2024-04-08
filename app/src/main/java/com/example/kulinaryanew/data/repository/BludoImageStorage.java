package com.example.kulinaryanew.data.repository;

import android.graphics.Bitmap;

public interface BludoImageStorage {

    void saveBludoImage(Bitmap image, String image_name, String format);

    Bitmap getBludoImage(String image_name);

    void deleteBludoImage(String image_name);
}
