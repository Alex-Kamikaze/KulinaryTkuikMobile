package com.example.kulinaryanew.data.db;

import androidx.annotation.NonNull;
import androidx.room.AutoMigration;
import androidx.room.Database;
import androidx.room.RoomDatabase;
import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

@Database(entities = { BludoCategoryEntity.class, BludoEntity.class }, version = 2)
public abstract class AppDatabase extends RoomDatabase {
    public abstract BludoDao getBludoDao();

    public abstract CategoryDao getCategoryDao();
    //TODO: Дописать миграцию для Room
    public static final Migration MIGRATION_1_2 = new Migration(1, 2) {
        @Override
        public void migrate(@NonNull SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.execSQL("ALTER TABLE BludoEntity ADD COLUMN BludoPhotoUri TEXT");
            supportSQLiteDatabase.execSQL("UPDATE BludoEntity SET BludoPhotoUri = CAST(BludoPhoto AS TEXT)");
            supportSQLiteDatabase.execSQL("ALTER TABLE BludoEntity DROP COLUMN BludoPhoto");
        }
    };
}
