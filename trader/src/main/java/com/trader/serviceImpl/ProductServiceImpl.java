package com.trader.serviceImpl;

import com.trader.entity.Product;
import com.trader.repository.ProductRepository;
import com.trader.service.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    private static final Logger log = LoggerFactory.getLogger(ProductServiceImpl.class);
    @Autowired
    ProductRepository productRepository;

    @Override
    public Product addProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public List<Product> getAllProduct() {
        return productRepository.findAll();
    }

    @Override
    public void updateProduct(Product product) {

        Product product1 = productRepository.findByCategoryId(product.getCategoryId());
        if (product1 != null) {
            log.info("product with this category id alredy present in database.");
        } else {
            productRepository.save(product);
            log.info("product insert successfuly in db..", product);
        }

    }

    @Override
    public List<Product> addProductList(List<Product> products) {
    return productRepository.saveAll(products);
    }
}
