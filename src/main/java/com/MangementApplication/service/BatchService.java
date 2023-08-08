package com.MangementApplication.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.MangementApplication.repository.BatchRepository;



@Service
public class BatchService {
    private BatchRepository batchRepository;

    private ProductService productService;

    @Autowired
    public BatchService(BatchRepository batchRepository,ProductService productService) {
        this.batchRepository = batchRepository;
        this.productService=productService;
    }



}
