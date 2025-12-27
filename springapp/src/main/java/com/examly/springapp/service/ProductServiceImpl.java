
package com.examly.springapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.examly.springapp.model.Product;
import com.examly.springapp.repository.ProductRepo;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepo productRepo;

    public Product AddProduct(Product product) {
        return productRepo.save(product);
    }

    public List<Product> GetAllProducts() {
        return productRepo.findAll();
    }

    public Product getProductById(int id) {
        return productRepo.findById(id).get();
    }

    public Product updateProduct(int id, Product product) {
        product.setProductId(id);
        return productRepo.save(product);
    }
}
