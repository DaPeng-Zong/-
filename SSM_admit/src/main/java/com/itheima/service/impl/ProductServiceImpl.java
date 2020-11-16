package com.itheima.service.impl;

import com.itheima.dao.ProductDao;
import com.itheima.domain.Product;
import com.itheima.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("productservice")
@Transactional //因为增加产品等功能涉及到事务操作，一定要加事务注解
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductDao productDao;

    public List<Product> FindAllProducts() {
//        System.out.println("业务层");
        return productDao.FindAllProducts();
    }

    public void SaveProduct(Product product) {
        System.out.println("业务层保存product");
        productDao.SaveProduct(product);
    }
}
