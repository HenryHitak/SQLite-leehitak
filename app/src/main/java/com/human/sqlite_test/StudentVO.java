package com.human.sqlite_test;

public class StudentVO {
    // Cursor id
    private int mId;
    // 학년
    private int mGrade;
    // 학번
    private int mNumber;
    // 이름
    private String mStrName;

    public int getmId() {
        return mId;
    }

    public void setmId(int mId) {
        this.mId = mId;
    }

    public int getmGrade() {
        return mGrade;
    }

    public void setmGrade(int mGrade) {
        this.mGrade = mGrade;
    }

    public int getmNumber() {
        return mNumber;
    }

    public void setmNumber(int mNumber) {
        this.mNumber = mNumber;
    }

    public String getmStrName() {
        return mStrName;
    }

    public void setmStrName(String mStrName) {
        this.mStrName = mStrName;
    }
}
