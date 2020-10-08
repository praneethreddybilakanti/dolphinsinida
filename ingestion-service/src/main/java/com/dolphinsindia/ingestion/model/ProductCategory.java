package com.dolphinsindia.ingestion.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "PRODUCT_CATEGORY")
public class ProductCategory {
	@Id
	private int productCategoryId;
	private String productCategoryName;
	@OneToMany(targetEntity = ProductSubCategory.class,cascade = CascadeType.ALL
			)
	@JoinColumn(name="category_sub_fk",referencedColumnName ="productCategoryId" )
	private List<ProductSubCategory> productSubCategory;

	

	public int getProductCategoryId() {
		return productCategoryId;
	}

	public void setProductCategoryId(int productCategoryId) {
		this.productCategoryId = productCategoryId;
	}

	public String getProductCategoryName() {
		return productCategoryName;
	}

	public void setProductCategoryName(String productCategoryName) {
		this.productCategoryName = productCategoryName;
	}

	public List<ProductSubCategory> getProductSubCategory() {
		return productSubCategory;
	}

	public void setProductSubCategory(List<ProductSubCategory> productSubCategory) {
		this.productSubCategory = productSubCategory;
	}

	public ProductCategory(int productCategoryId, String productCategoryName,
			List<ProductSubCategory> productSubCategory) {
		super();
		this.productCategoryId = productCategoryId;
		this.productCategoryName = productCategoryName;
		this.productSubCategory = productSubCategory;
	}

	public ProductCategory() {
		super();
	}

}
