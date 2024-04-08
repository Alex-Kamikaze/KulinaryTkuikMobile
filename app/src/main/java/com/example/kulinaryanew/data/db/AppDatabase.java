package com.example.kulinaryanew.data.db;

import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.RoomDatabase;
import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

@Database(entities = { BludoCategoryEntity.class, BludoEntity.class }, version = 2)
public abstract class AppDatabase extends RoomDatabase {
    public abstract BludoDao getBludoDao();

    public abstract CategoryDao getCategoryDao();
    public static final Migration MIGRATION_1_2 = new Migration(1, 2) {
        @Override
        public void migrate(@NonNull SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.execSQL("ALTER TABLE BludoEntity ADD COLUMN BludoImageUri TEXT");
            supportSQLiteDatabase.execSQL("UPDATE BludoEntity SET BludoImageUri = '' || BludoPhoto");
            supportSQLiteDatabase.execSQL("CREATE TEMPORARY TABLE BludoEntitybackup(BludoId INTEGER, BludoName TEXT, CategoryId INTEGER, BludoImageUri TEXT, BludoPrice INTEGER)");
            supportSQLiteDatabase.execSQL("INSERT INTO BludoEntitybackup SELECT BludoId, BludoName, CategoryId, BludoImageUri, BludoPrice FROM BludoEntity");
            supportSQLiteDatabase.execSQL("DROP TABLE BludoEntity");
            supportSQLiteDatabase.execSQL("CREATE TABLE BludoEntity(BludoId INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, BludoName TEXT, CategoryId INTEGER NOT NULL, BludoImageUri TEXT, BludoPrice INTEGER NOT NULL, FOREIGN KEY (CategoryId) REFERENCES BludoCategoryEntity(CategoryId) ON DELETE CASCADE)");
            supportSQLiteDatabase.execSQL("INSERT INTO BludoEntity SELECT BludoId, BludoName, CategoryId, BludoImageUri, BludoPrice FROM BludoEntitybackup");
            supportSQLiteDatabase.execSQL("DROP TABLE BludoEntitybackup");
        }
    };
}
