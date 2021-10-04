package com.company;

public class Student extends Object {

    private String studentName;
    private int studentID;
    private double english;
    private double maths;


    public Student() {

    }

    public Student(String sn,int sid,double eng,double m) {
        this.studentName = sn;
        this.studentID   = sid;
        this.english     = eng;
        this.maths       = m;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setEnglish(double english) {
        this.english = english;
    }

    public double getEnglish() {
        return english;
    }

    public void setMaths(double maths) {
        this.maths = maths;
    }

    public double getMaths() {
        return maths;
    }

    public double total_Score() {
         return this.english + this.maths;
    }
}
