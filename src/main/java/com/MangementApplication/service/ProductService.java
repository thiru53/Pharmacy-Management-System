package com.MangementApplication.service;

import com.MangementApplication.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;


import com.MangementApplication.repository.BatchRepository;
import com.MangementApplication.repository.ProductRepository;

import java.time.LocalDate;
import java.util.List;


@Service
public class ProductService {
    private final ProductRepository productRepository;

    @Autowired
    private BatchRepository batchRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product saveProduct(Product product) {
        //If the product name already exists
        boolean isProductExistsByName = productRepository.existsByName(product.getName());
        if(isProductExistsByName){
          throw new RuntimeException("Product already exists with name :"+product.getName());
        }
        product.setCreatedAt(LocalDate.now());
        product.setUpdatedAt(LocalDate.now());
        return productRepository.save(product);
    }


    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Product findById(Long id) {
        return productRepository.findById(id).orElseThrow(() -> new RuntimeException("Product does not exists by id :"+id));
    }
}

