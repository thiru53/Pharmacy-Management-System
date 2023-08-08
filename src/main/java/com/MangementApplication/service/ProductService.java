package com.MangementApplication.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;


import com.MangementApplication.repository.BatchRepository;
import com.MangementApplication.repository.ProductRepository;


@Service
public class ProductService {
    private final ProductRepository productRepository;

    @Autowired
    private BatchRepository batchRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }


}

