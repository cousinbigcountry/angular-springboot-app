package com.lft.ecommerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.lft.ecommerce.entity.ProductCategory;
@CrossOrigin("http://localhost:4200")
@RepositoryRestResource(collectionResourceRel = "productCategory", path="product-categories")
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Long>{

}
