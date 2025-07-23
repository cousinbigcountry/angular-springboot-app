package com.lft.ecommerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.lft.ecommerce.entity.ProductCategory;

@RepositoryRestResource(collectionResourceRel = "productCategory", path="product-categories")
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Long>{

}
