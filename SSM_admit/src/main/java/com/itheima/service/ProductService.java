package com.itheima.service;

import com.itheima.domain.Product;

import java.util.List;

public interface ProductService {

    //查询所有
    public List<Product> FindAllProducts();

    void SaveProduct(Product product);
}
