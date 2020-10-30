package com.itspring.service.impl;

import com.itspring.service.someService;

public class someServiceImpl implements someService {
    public someServiceImpl() {
        System.out.println("someserviceImpl的无参构造方法");
    }

    @Override
    public void dosomg() {
        System.out.println("执行力some service的dosome方法");
    }
}
