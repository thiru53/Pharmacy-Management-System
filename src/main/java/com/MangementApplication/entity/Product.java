package com.MangementApplication.entity;



import jakarta.persistence.*;


import java.time.LocalDate;

@Entity
@Table(name="product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int qty;
    private double price;
    private LocalDate createdAt;
    private LocalDate updatedAt;



    //Getter , Setter and Constructor
}
