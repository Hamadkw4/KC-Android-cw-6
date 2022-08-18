package com.example.hamad13;

public class Student {
        private  String studentName;
        private int studentage;

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentage() {
        return studentage;
    }

    public void setStudentage(int studentage) {
        this.studentage = studentage;
    }

    public int getStudentphoto() {
        return Studentphoto;
    }

    public void setStudentphoto(int studentphoto) {
        Studentphoto = studentphoto;
    }

    private  int Studentphoto;

    public Student(String studentName, int studentage, int studentphoto) {
        this.studentName = studentName;
        this.studentage = studentage;
        Studentphoto = studentphoto;
    }
}

