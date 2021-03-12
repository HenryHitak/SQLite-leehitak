package com.human.sqlite_test;

import android.provider.BaseColumns;

public class DatabaseTables {

    public static class StudentTable implements BaseColumns {
        public static final String TABLE_NAME = "student";
        public static final String GRADE = "column_grade";
        public static final String NUMBER = "column_number";
        public static final String NAME = "column_name";
    }
}
