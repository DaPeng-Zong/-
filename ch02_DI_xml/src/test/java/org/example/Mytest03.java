package org.example;


import com.ba03.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.File;

public class Mytest03 {
    @Test
    public void Test01(){
        String config = "ba03/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
//        Student student = (Student) ac.getBean("mystudent");
//        Student student2 = (Student) ac.getBean("mystudent2");
//        Student student3 = (Student) ac.getBean("mystudent3");
//        System.out.println(student);
//        System.out.println(student2);
//        System.out.println(student3);
        File myfile = (File)ac.getBean("myfile");
        System.out.println(myfile.getName());
    }


}
