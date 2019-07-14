package com.gmail.bisrihanafi;


import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;

import java.io.Serializable;

public class MySQLHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "photodescription.db";
    private static final int DATABASE_VERSION = 1;
    // Table name
    public static final String TABLE = "data";
    // Columns
    public static final String photo = "photo";
    public static final String desc = "desc";
    public MySQLHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        //TODO Auto-generated constructor stub
    }




    @Override
    public void
    onCreate(SQLiteDatabase db) {
        String sql = "create table " + TABLE
                + "( _id"
                + " integer primary key autoincrement, " + photo
                + " text not null, " + desc
                + " text not null);";
        Log.d("Data", "onCreate: " + sql);
        db.execSQL(sql);
    }
    @Override
    public void
    onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        //TODO Auto-generated method stub
        //db.execSQL("DROP TABLE IF EXISTS "+DATABASE_NAME);
        //onCreate(db);
    }


}