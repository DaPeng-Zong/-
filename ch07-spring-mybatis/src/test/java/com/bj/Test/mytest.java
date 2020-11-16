package com.bj.Test;

import com.bj.dao.StudentDao;
import com.bj.domain.Student;
import com.bj.service.StudentService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.xml.ws.Service;
import java.util.List;

public class mytest {

    @Test
    public void test01() {
        String config = "SpringApplicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        String names[] = ac.getBeanDefinitionNames();//获取所有对象的名称
        for (String name : names
        ) {
            System.out.println(name + "容器中对象的名称" + ac.getBean(name));
        }
    }

    @Test
    public void test02() {
        String config = "SpringApplicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        //获取spring容器中的dao对象
        StudentDao studentDao = (StudentDao) ac.getBean("studentDao");
        Student student = new Student();
        student.setAge(12);
        student.setEmail("gfdsafga");
        student.setId(1012);
        student.setName("黑马");
        int n = studentDao.insertStudent(student);
        System.out.println(n);

    }

    @Test
    public void Servicetest03() {
        String config = "SpringApplicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        //获取spring容器中的dao对象
        StudentService studentService = (StudentService) ac.getBean("studentService");
        Student student = new Student();
        student.setAge(12);
        student.setEmail("gfdsafga");
        student.setId(1012);
        student.setName("李圣卢");
        int n = studentService.addStudent(student);
        System.out.println(n);

    }
}