package com.MangementApplication.repository;



import org.springframework.data.jpa.repository.JpaRepository;


import com.MangementApplication.entity.Batch;


public interface BatchRepository extends JpaRepository <Batch, Long> {


    // Add custom query methods if needed


}

