package com.dolphinsindia.ingestion.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dolphinsindia.ingestion.model.ProductSubCategory;

public interface ProductSubCategoryRepo extends JpaRepository<ProductSubCategory, Integer> {

}
