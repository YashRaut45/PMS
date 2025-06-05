package com.yash.pms.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.yash.pms.entity.Product;
import com.yash.pms.repository.ProductRepository;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepo;

    public Page<Product> getAllProducts(Pageable pageable) {
        return productRepo.findAll(pageable);
    }

    public Product getProductById(Long id) {
        return productRepo.findById(id).orElseThrow();
    }

    public Product createProduct(Product product) {
        return productRepo.save(product);
    }
    public Product updateProduct(Long id, Product product) {
        Product existing = productRepo.findById(id).orElseThrow();
        existing.setName(product.getName());
        existing.setPrice(product.getPrice());
 //       existing.setCategory(product.getCategory());
        return productRepo.save(existing);
    }


    public void deleteProduct(Long id) {
        productRepo.deleteById(id);
    }
}
