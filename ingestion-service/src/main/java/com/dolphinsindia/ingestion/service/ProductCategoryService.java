package com.dolphinsindia.ingestion.service;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dolphinsindia.ingestion.dao.ProductCategoryRepo;
import com.dolphinsindia.ingestion.model.ProductCategory;

@Service
public class ProductCategoryService {

	@Autowired
	private ProductCategoryRepo productCategoryRepo;

	public Set<String> getInfoSubCategories(String name) {

		Set<String> l = productCategoryRepo.findByProductCategoryName(name);
		System.out.println(l);
		return l;
	}

	public Set<String> getAllProductCategories() {
		// TODO Auto-generated method stub
		return productCategoryRepo.findAllByCategories();
	}

	public ProductCategory addProduct(ProductCategory pc) {
		ProductCategory productCategory = new ProductCategory();
		String name = pc.getProductCategoryName();
		String s1 = name.substring(0, 1).toUpperCase();
		String capitalized = s1 + name.substring(1);
		pc.setProductCategoryId(pc.getProductCategoryId());
		pc.setProductCategoryName(capitalized);
		pc.setProductSubCategory(pc.getProductSubCategory());
		return productCategoryRepo.save(productCategory);
	}
}
