package com.example.gujarati.naeshuruwat;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Gujarati on 17-02-2018.
 */

public class mydatabase1 extends SQLiteOpenHelper
{
    public mydatabase1(Context context) {
        super(context, "MYDBS",null, 100);
    }

    @Override
    public void onCreate(SQLiteDatabase sql) {

        sql.execSQL("create table user_details(username string,password string,phone string)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
