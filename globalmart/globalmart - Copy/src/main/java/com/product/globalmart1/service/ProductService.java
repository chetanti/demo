package com.product.globalmart1.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.globalmart1.dao.ProductDAO;
import com.product.globalmart1.entity.ProductEntity;
import com.product.globalmart1.model.Product;

@Service
public class ProductService {

	@Autowired
	ProductDAO productDao;
	
	public List<Product> getProductDetails(){

		Collection<ProductEntity> collec =(Collection<ProductEntity>) productDao.findAll();
		List<Product> listProduct = new ArrayList<Product> ();
		for (ProductEntity bikeEntity : collec) {
			Product bike=new Product();
			BeanUtils.copyProperties(bikeEntity, bike);
			listProduct.add(bike);
		}
		
		return listProduct;
	
	}
	
	public int addProduct(Product product){
		System.out.println("add Product ");
		ProductEntity productEntity = new ProductEntity();
		productEntity.setId(product.getId());
		productEntity.setProductName(product.getProductName());
		productEntity.setPrice(product.getPrice());
		productEntity.setDescription(product.getDescription());
		productEntity.setProductType(product.getProductType());
		System.out.println(productEntity.toString());
		ProductEntity productObj = (ProductEntity)productDao.save(productEntity);
		System.out.println("Product created details " + productObj);
		return productObj.getId();
	}
	
	public List<Product> getProductByType(String type) {
		List<Product> listProduct = new ArrayList<Product> ();
		System.out.println(" find by type " + type);
		List<ProductEntity> listProductEntity = productDao.findByProductType(type);
		for(ProductEntity productEntity :listProductEntity)
		{
			Product product = new Product();
			BeanUtils.copyProperties(productEntity, product);
			listProduct.add(product);
		}
		
		return listProduct;
		
	}

	public Product deleteProduct(int id) {
		Product product = null;
		
		ProductEntity productEntity = productDao.findOne(id);
		if(productEntity != null) {
			productDao.delete(productEntity);
			
			product = new Product();
			BeanUtils.copyProperties(productEntity, product);
		}
		System.out.println(" deleted the obj " + product);
		return product;
		
	}
}
