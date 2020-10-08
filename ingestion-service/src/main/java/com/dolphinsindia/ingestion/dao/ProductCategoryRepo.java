package com.dolphinsindia.ingestion.dao;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.dolphinsindia.ingestion.model.ProductCategory;

@Repository
public interface ProductCategoryRepo extends JpaRepository<ProductCategory, Integer> {

	@Query(value = "select sc.product_sub_category_name from product_category pc join product_sub_category sc on pc.product_category_id=sc.category_sub_fk where pc.product_category_name=?1", nativeQuery = true)
	Set<String> findByProductCategoryName(String productCategoryName);

	@Query(value = "select pc.product_category_name from product_category pc", nativeQuery = true)
	Set<String> findAllByCategories();
}
