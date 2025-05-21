package com.himanth;



public class Student {
    private String rollNo;
    private String name;
    private int marks;
    private String grade;

    public Student() {
        // Default constructor
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
        calculateGrade(); // Trigger grade computation
    }

    public String getGrade() {
        return grade;
    }

    private void calculateGrade() {
        if (marks >= 90) {
            grade = "A+";
        } else if (marks >= 75) {
            grade = "A";
        } else if (marks >= 60) {
            grade = "B";
        } else if (marks >= 45) {
            grade = "C";
        } else {
            grade = "F";
        }
    }

    public boolean isPass() {
        return marks >= 45;
    }
}

