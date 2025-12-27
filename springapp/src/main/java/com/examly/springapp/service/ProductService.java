package com.examly.springapp.service;

import java.util.List;
import com.examly.springapp.model.Product;

public interface ProductService {
    Product AddProduct(Product product);
    List<Product> GetAllProducts();
    Product getProductById(int id);
    Product updateProduct(int id, Product product);
}

