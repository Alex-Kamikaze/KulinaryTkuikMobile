package com.example.kulinaryanew.data.db;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = { BludoCategoryEntity.class, BludoEntity.class }, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract BludoDao getBludoDao();

    public abstract CategoryDao getCategoryDao();
}
