package com.human.sqlite_test;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.human.sqlite_leehitak.R;

public class MainActivity extends AppCompatActivity {
    //멤버변수 선언
    private DatabaseHelper mDatabaseHelper;
    private SQLiteDatabase mSqLiteDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //DB객체 생성
        mDatabaseHelper = new DatabaseHelper(this,"student.db",null,1);
        //위에서 생성한 객체파일 생성
        mSqLiteDatabase = mDatabaseHelper.getWritableDatabase();
    }
}