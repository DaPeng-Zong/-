package com.itheima.controller;


import com.itheima.domain.Order;
import com.itheima.service.impl.OrderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RequestMapping("/order")
@Controller
public class OrderController {

    @Autowired
    private OrderServiceImpl orderService;

    @RequestMapping("/findall.do")
    public ModelAndView findAll(@RequestParam(name = "page", required = true, defaultValue = "1") Integer page, @RequestParam(name = "pageSize", required = true, defaultValue = "10") Integer pageSize) throws Exception {
        List<Order> ordersList = orderService.findAll(page,pageSize);
        ModelAndView mv = new ModelAndView();
        mv.setViewName("orders-list");
        mv.addObject("ordersList", ordersList);
        return mv;
    }

}
