package com.bj.dao;

import com.bj.domain.Student;

import java.util.List;

public interface OrderDao {
    int insertStudent(Student student);
    List<Student> selectStudent();
}
