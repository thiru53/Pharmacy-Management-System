package com.MangementApplication.entity;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.*;




@Entity
@Table(name="batch")
public class Batch {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long batchId;

    @JsonIgnoreProperties({"hibernateLazyInitializer"})
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "productId", referencedColumnName = "id")
    private Product product;
    private int qty;
    private LocalDate expiryDate;
    private LocalDate createdAt;
    private LocalDate updatedAt;



    //Getter , Setter and Constructor

}
