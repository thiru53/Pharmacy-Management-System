package com.MangementApplication.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.MangementApplication.entity.SaleItems;

@Repository
public interface SaleItemsRepository extends JpaRepository<SaleItems, Long> {

    // Add any additional query methods if needed
}

