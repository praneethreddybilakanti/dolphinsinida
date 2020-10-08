package com.dolphinsindia.ingestion.controller;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dolphinsindia.ingestion.dao.ProductCategoryRepo;
import com.dolphinsindia.ingestion.dao.ProductSubCategoryRepo;
import com.dolphinsindia.ingestion.model.ProductCategory;
import com.dolphinsindia.ingestion.model.ProductSubCategory;
import com.dolphinsindia.ingestion.service.ProductCategoryService;

@RestController
@RequestMapping(path = "ingestion")
public class IngestionController {

	@Autowired
	ProductCategoryRepo productCategoryRepo;

	@Autowired
	ProductSubCategoryRepo productSubCategoryRepo;
	
	@Autowired
	ProductCategoryService productCategoryService;

	@GetMapping("/productcategories")
	public List<ProductCategory> getAllProductCategories() {
		return productCategoryRepo.findAll();
	}

	@GetMapping("/productSubCategories")
	public List<ProductSubCategory> getAllSubCategories() {
		return productSubCategoryRepo.findAll();
	}

	@PostMapping("/addproductcategories")
	public ProductCategory addProductCategories(@RequestBody ProductCategory productcategoryrequest) {
		
		return productCategoryService.addProduct(productcategoryrequest);
	}

	@GetMapping("/{category}")
	public Set<String> getAllSubCategoriesOfCategories(@PathVariable("category") String category) {
		return productCategoryService.getInfoSubCategories(category);
	}

	@GetMapping("/productcategorynames")
	public Set<String> getAllProductCategoriesNames() {
		return productCategoryService.getAllProductCategories();
	}

}
