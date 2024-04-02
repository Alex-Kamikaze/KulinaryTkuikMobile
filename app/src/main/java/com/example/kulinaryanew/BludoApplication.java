package com.example.kulinaryanew;

import android.app.Application;

import androidx.room.Room;

import com.example.kulinaryanew.data.db.AppDatabase;

public class BludoApplication extends Application {

    public static BludoApplication INSTANCE;
    private static AppDatabase db;

    @Override
    public void onCreate() {
        super.onCreate();
        INSTANCE = this;
        db = Room.databaseBuilder(this, AppDatabase.class, "app.db").build();
    }

    public static BludoApplication getInstance() {
        return INSTANCE;
    }

    public AppDatabase getDb() {
        return db;
    }
}
