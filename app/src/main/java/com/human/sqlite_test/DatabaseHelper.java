package com.human.sqlite_test;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.annotation.Nullable;
import com.human.sqlite_test.DatabaseTables.StudentTable;

public class DatabaseHelper extends SQLiteOpenHelper {

    private static final String SQL_CREATE_TABLE =
            "CREATE TABLE " + StudentTable.TABLE_NAME + " (" +
                    StudentTable._ID + " INTEGER PRIMARY KEY," +
                    StudentTable.GRADE + " INTEGER," +
                    StudentTable.NUMBER + " INTEGER," +
                    StudentTable.NAME + " TEXT)";

    private static final String SQL_DELETE_TABLE =
            "DROP TABLE IF EXISTS " + StudentTable.TABLE_NAME;

    public DatabaseHelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(SQL_CREATE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL(SQL_DELETE_TABLE);
        onCreate(sqLiteDatabase);
    }
}
