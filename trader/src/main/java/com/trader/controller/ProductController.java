package com.trader.controller;

import com.trader.entity.Product;
import com.trader.repository.ProductRepository;
import com.trader.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/trader")
public class ProductController {
    @Autowired
    ProductService productService;


    @PostMapping("/product/add")
    Product addProduct(@RequestBody Product product) {
        return productService.addProduct(product);
    }
@GetMapping("/product/get")
   List<Product> getProductsList(){
        return productService.getAllProduct();
    }
    @PostMapping("/product/addOrUpdate")
    void addOrUpdateProduct(@RequestBody Product product){
       productService.updateProduct(product);
    }
    @PostMapping("/product/addAll")
    void addAllProduct(@RequestBody List<Product> products){
        productService.addProductList(products);

    }

}
