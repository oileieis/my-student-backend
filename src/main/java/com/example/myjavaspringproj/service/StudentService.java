package com.example.myjavaspringproj.service;

import com.example.myjavaspringproj.model.Student;

import java.util.List;

public interface StudentService {
    public Student saveStudent(Student student);

    public List<Student> getAllStudent();
}


