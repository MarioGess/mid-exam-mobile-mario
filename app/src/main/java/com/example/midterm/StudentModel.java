package com.example.midterm;

public class StudentModel {
    Integer id;
    String name, studentId;
    int age;

    public StudentModel(String name, String studentId, int age) {
        this.name = name;
        this.studentId = studentId;
        this.age = age;
    }

    public StudentModel(Integer id, String name, String studentId, int age) {
        this.id = id;
        this.name = name;
        this.studentId = studentId;
        this.age = age;
    }

    public Integer getId() { return id; }
    public String getName() { return name; }
    public String getStudentId() { return studentId; }
    public int getAge() { return age; }
}