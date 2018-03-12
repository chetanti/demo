package com.product.globalmart1.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.product.globalmart1.entity.ProductEntity;

public interface ProductDAO extends CrudRepository<ProductEntity, Integer>{

	List<ProductEntity> findByProductType(String productType);
}
