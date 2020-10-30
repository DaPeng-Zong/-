package org.example;

import com.itspring.service.impl.someServiceImpl;
import com.itspring.service.someService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    @Test
    public void test01(){
        someService  someService = new someServiceImpl();
        someService.dosomg();
    }

    /**
     * spring默认创建对象的时间：在创建spring的容器时，会创建配置文件的所有对象
     */
    @Test
    public void test02(){
        //使用spring容器创建对象
        //1.指定spring配置文件的名称
        String config = "beans.xml";
        //2.创建标识spring容器的对象，ApplicationContxt
        //ApplicationContext就是表示spring容器，通过容器获取对象
        //ClassPathXmlApplicationContext：表示从类路径中加载spring的配置文件（beans.xml）
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);

        //从容器中获取对象，要调用对象的方法，getBean("配置文件中的bean的id值")
        someService someService = (someService)ac.getBean("someService");

        //使用spring创建好的对象
        someService.dosomg();
    }

    /**
     * 获取spring容器中Java对象的信息
     */
    @Test
    public void test03(){

    }
}
