package com.MangementApplication.controller;




import java.util.HashMap;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.MangementApplication.entity.OrderDto;
import com.MangementApplication.service.SalesService;




@RestController
public class SalesController {
    @Autowired
    private SalesService salesService;
    @PostMapping("/processOrder")
    public ResponseEntity<Object> processOrder(@RequestBody OrderDto orderDto) {
        return ResponseEntity.ok(createResponseMessage("success/failure", "Placeholde for logic of processing order "));

    }



    @GetMapping("/Sales")
    public ResponseEntity<Object> getAllSales() {
        return ResponseEntity.ok(createResponseMessage("success/failure", "Placeholde for logic of retrival of all sales from sales table"));

    }

    @GetMapping("/Sales/{saleId}/items")
    public ResponseEntity<Object> getSaleItemsBySaleId(@PathVariable Long saleId) {
        return ResponseEntity.ok(createResponseMessage("success/failure", "Placeholde for logic of retrival of all sales items  for specific sales id"));

    }

    private Map<String, Object> createResponseMessage(String status, Object message) {
        Map<String, Object> response = new HashMap<>();
        response.put("status", status);
        response.put("message", message);
        return response;
    }

}


