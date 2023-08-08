package com.MangementApplication.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import com.MangementApplication.entity.BatchRequestDTO;

import com.MangementApplication.entity.ProductRequestDTO;
import com.MangementApplication.service.BatchService;
import com.MangementApplication.service.ProductService;

import java.util.HashMap;
import java.util.Map;


@RestController
@RequestMapping("/product")
public class ProductController {
    private ProductService productService;
    private BatchService batchService;

    @Autowired
    public ProductController(ProductService productService, BatchService batchService) {
        this.productService = productService;
        this.batchService = batchService;
    }


    @GetMapping
    public ResponseEntity<Object> getAllProducts() {
        return ResponseEntity.ok(createResponseMessage("success/failure", "Placeholde for logic of retrival of all product data from product table"));


    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> getProductById(@PathVariable Long id) {
        return ResponseEntity.ok(createResponseMessage("success/failure", "Placeholde for logic of retrival of  product using its id from product table"));

    }

    @PostMapping("/add")
    public ResponseEntity<Map<String, Object>> addProduct(@RequestBody ProductRequestDTO requestDTO) {
        return ResponseEntity.ok(createResponseMessage("success/failure", "Placeholde for logic of addition of product"));

    }

    @PostMapping("/batch/add/{product_id}")
    public ResponseEntity<Object> addBatch(@PathVariable("product_id") Long productId, @RequestBody BatchRequestDTO requestDTO) {
        return ResponseEntity.ok(createResponseMessage("success/failure", "Placeholde for logic of addition of batch for product using product id"));

    }

    private Map<String, Object> createResponseMessage(String status, Object message) {
        Map<String, Object> response = new HashMap<>();
        response.put("status", status);
        response.put("message", message);
        return response;
    }

    @PostMapping("/update/{product_id}")
    public ResponseEntity<Object> updateProduct(@PathVariable("product_id") Long productId, @RequestBody ProductRequestDTO requestDTO) {
        return ResponseEntity.ok(createResponseMessage("success/failure", "Placeholde for logic of updating product"));

    }

    @PostMapping("/batch/update/{batch_id}")
    public ResponseEntity<Object> updateBatch(@PathVariable("batch_id") Long batchId, @RequestBody BatchRequestDTO requestDTO) {
        return ResponseEntity.ok(createResponseMessage("success/failure", "Placeholde for logic of updating batch"));

    }



    @GetMapping("/batch/{product_id}")
    public ResponseEntity<Object> getAllBatchesByProductId(@PathVariable("product_id") Long productId) {
        return ResponseEntity.ok(createResponseMessage("success/failure", "Placeholde for logic of retrival of all batch data of specific product "));

    }

    @PostMapping("/delete/{product_id}")
    public ResponseEntity<Object> deleteProduct(@PathVariable("product_id") Long productId) {
        return ResponseEntity.ok(createResponseMessage("success/failure", "Placeholde for logic of deleting product and all its associated batches"));

    }

    @PostMapping("/batch/delete/{batch_id}")
    public ResponseEntity<Object> deleteBatch(@PathVariable("batch_id") Long batchId) {
        return ResponseEntity.ok(createResponseMessage("success/failure", "Placeholde for logic of deleting the batch "));

    }
    @GetMapping("/batch")
    public ResponseEntity<Object> getAllBatches() {
        return ResponseEntity.ok(createResponseMessage("success/failure", "Placeholde for logic of retrival of all batch data from batch table"));

    }

    @GetMapping("/batchById/{batch_id}")
    public ResponseEntity<Object> getBatchById(@PathVariable("batch_id") Long batchId) {
        return ResponseEntity.ok(createResponseMessage("success/failure", "Placeholde for logic of retrival of all batch using batch id"));

    }


    @GetMapping("/stock/{product_id}")
    public ResponseEntity<Object> getProductStockDetails(@PathVariable("product_id") Long productId) {
        return ResponseEntity.ok(createResponseMessage("success/failure", "Placeholde for logic of displaying stock of specific product"));

    }

    @GetMapping("/stock")
    public ResponseEntity<Object> getAllProductStockDetails() {
        return ResponseEntity.ok(createResponseMessage("success/failure", "Placeholde for logic of displaying stock of all product in product table"));
    }


}









