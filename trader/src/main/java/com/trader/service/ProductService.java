package com.trader.service;

import com.trader.entity.Product;

import java.util.List;

public interface ProductService {

     public Product addProduct(Product product);
     public List<Product> getAllProduct();
     public void updateProduct(Product product);
     public List<Product> addProductList(List<Product> products);

}
