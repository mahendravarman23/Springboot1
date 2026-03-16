package com.example.assignment3;

import java.util.ArrayList;
import java.util.List;

public class User {

    List<Student> students = new ArrayList<>();

    public void addStudent(Student s) {
        students.add(s);
    }

    public List<Student> getStudents() {
        return students;
    }
}