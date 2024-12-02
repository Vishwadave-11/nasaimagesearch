package com.example.nasaimagesearch;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBOpener extends SQLiteOpenHelper {

    protected final static String DATABASE_NAME = "NASA_DB";
    protected final static int VERSION_NUM = 1;
    public final static String TABLE_NAME = "DATE_ITEM";
    public final static String COL_ID = "_id";
    public final static String COL_DATE = "DATE";
    public final static String COL_TITLE = "TITLE";
    public final static String COL_EXPLANATION = "EXPLANATION";
    public final static String COL_IMAGE_URL = "IMAGE_URL";

    public DBOpener (Context context) {
        super(context, DATABASE_NAME, null, VERSION_NUM);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE " + TABLE_NAME + " ( " +
                COL_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                COL_DATE + " TEXT UNIQUE, " +
                COL_TITLE + " TEXT, " +
                COL_EXPLANATION + " TEXT, " +
                COL_IMAGE_URL + " TEXT);");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // Drop current db
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        // Create new db
        onCreate(db);
    }
}

