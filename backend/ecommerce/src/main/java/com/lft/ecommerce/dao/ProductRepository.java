package com.lft.ecommerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lft.ecommerce.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
