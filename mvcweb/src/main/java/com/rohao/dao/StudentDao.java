package com.rohao.dao;

import com.rohao.Domain.Student;

import java.util.List;

public interface StudentDao {
    int insertStudent(Student student);

    List<Student> selectStudents();
}
