package com.bj.service.impl;

import com.bj.dao.StudentDao;
import com.bj.domain.Student;
import com.bj.service.StudentService;

import java.util.List;

public class StudentServiceImpl implements StudentService {
    //引用类型
    private StudentDao studentDao;

    //使用set注入赋值
    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    public int addStudent(Student student) {
        int nums = studentDao.insertStudent(student);
        return nums;
    }

    public List<Student> queryStudent() {
        List<Student> students = studentDao.selectStudent();
        return students;
    }
}
