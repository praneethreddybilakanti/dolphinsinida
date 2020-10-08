package com.dolphinsindia.ingestion.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "PRODUCT_SUB_CATEGORY")
@Entity
public class ProductSubCategory {
	@Id
	private int productSubCategoryId;
	private String productSubCategoryName;

	public int getProductSubCategoryId() {
		return productSubCategoryId;
	}

	public void setProductSubCategoryId(int productSubCategoryId) {
		this.productSubCategoryId = productSubCategoryId;
	}

	public String getProductSubCategoryName() {
		return productSubCategoryName;
	}

	public void setProductSubCategoryName(String productSubCategoryName) {
		this.productSubCategoryName = productSubCategoryName;
	}

	public ProductSubCategory(int productSubCategoryId, String productSubCategoryName) {
		super();
		this.productSubCategoryId = productSubCategoryId;
		this.productSubCategoryName = productSubCategoryName;
	}

	public ProductSubCategory() {
		super();
	}

}
