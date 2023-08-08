package com.MangementApplication.service;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import com.MangementApplication.repository.BatchRepository;
import com.MangementApplication.repository.ProductRepository;
import com.MangementApplication.repository.SaleItemsRepository;
import com.MangementApplication.repository.SalesRepository;



@Service
public class SalesService {
    private SalesRepository salesRepository;
    private SaleItemsRepository saleItemsRepository;
    private ProductRepository productRepository;
    private BatchRepository batchRepository;
    private ProductService productService;

    @Autowired
    public SalesService(SalesRepository salesRepository, SaleItemsRepository saleItemsRepository,
                        ProductRepository productRepository, BatchRepository batchRepository,ProductService productService) {
        this.salesRepository = salesRepository;
        this.saleItemsRepository = saleItemsRepository;
        this.productRepository = productRepository;
        this.batchRepository = batchRepository;
        this.productService=productService;
    }


}

