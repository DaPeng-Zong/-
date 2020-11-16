package com.itheima.controller;


import com.itheima.domain.Product;
import com.itheima.service.impl.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.UUID;

@Controller("productcontroller")
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductServiceImpl productService;

    @RequestMapping("/findAll.do")
    public ModelAndView findAllproduct(){
        ModelAndView mv = new ModelAndView();
        List<Product> list = productService.FindAllProducts();
        mv.addObject("productList", list);
        mv.setViewName("product-list");
        return mv;
    }

    @RequestMapping("/save.do")
    public String saveProduct(Product product){
        System.out.println("控制层新增产品");
        productService.SaveProduct(product);
        return "redirect:findAll.do";
    }

}
