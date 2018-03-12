package com.product.globalmart.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.product.globalmart.entity.ProductEntity;

public interface ProductDAO extends JpaRepository<ProductEntity, Integer>{

	List<ProductEntity> findByProductType(String productType);
	
	List<ProductEntity> findByProductName(String productName);
	
}
