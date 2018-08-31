package com.example.gujarati.naeshuruwat;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Gujarati on 06-09-2017.
 */

public class mydatabase extends SQLiteOpenHelper{
    public mydatabase(Context contex) {
        super(contex, "dbms", null, 100);
    }

    @Override
    public void onCreate(SQLiteDatabase sql) {
        sql.execSQL("create table user_details(username string,password string,phone string)");
        
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
