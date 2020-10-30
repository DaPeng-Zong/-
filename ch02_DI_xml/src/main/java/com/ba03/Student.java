package com.ba03;

public class Student {
    private String name;
    private int age;

    //声明一个引用类型
    private School school;


    public Student(){
        System.out.println("spring调用无参构造创建对象");
    }

    /**
     * 创建有参构造方法
     * @param name
     * @param age
     * @param school
     */
    public Student(String name, int age, School school) {
        System.out.println("student有参数构造方法");
        //属性赋值
        this.name = name;
        this.age = age;
        this.school = school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    public void setName(String name) {
        System.out.println("setName" + name);
        this.name = name;
    }

    public void setAge(int age) {
        System.out.println("setAge" + age);
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", school=" + school +
                '}';
    }
}
