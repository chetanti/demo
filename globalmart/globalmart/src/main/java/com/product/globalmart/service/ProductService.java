package com.product.globalmart.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.globalmart.dao.ProductDAO;
import com.product.globalmart.entity.ProductEntity;
import com.product.globalmart.model.Product;

@Service
public class ProductService {

	@Autowired
	ProductDAO productDao;
	

	/**
	 * Following method will list all products present in product catalog
	 * @param 
	 * @return List of all product
	 */
	public List<Product> getProductDetails(){

		Collection<ProductEntity> collec =(Collection<ProductEntity>) productDao.findAll();
		List<Product> listProduct = new ArrayList<Product> ();
		for (ProductEntity productEntity : collec) {
			Product product=new Product();
			BeanUtils.copyProperties(productEntity, product);
			listProduct.add(product);
		}
		
		return listProduct;
	
	}
	/**
	 * Following method will add new product in product catalogue
	 * @param product
	 * @return id of newly added product
	 */
	public int addProduct(Product product){
		
		ProductEntity productEntity = new ProductEntity();
		BeanUtils.copyProperties(product, productEntity);
		
		ProductEntity productObj = (ProductEntity)productDao.save(productEntity);
		
		return productObj.getId();
	}
	
	/**
	 * Following method will give product details of particular type
	 * @param type
	 * @return list of products
	 */
	public List<Product> getProductsByType(String type) {
		List<Product> listProduct = new ArrayList<Product> ();
		
		List<ProductEntity> listProductEntity = productDao.findByProductType(type);
		for(ProductEntity productEntity :listProductEntity)
		{
			Product product = new Product();
			BeanUtils.copyProperties(productEntity, product);
			listProduct.add(product);
		}
		
		return listProduct;
		
	}

	/**
	 * Following method will give product details of particular id passed
	 * @param id
	 * @return product
	 */
	public Product getProductsById(int id) {
		
		Product product = new Product();
		ProductEntity productEntity = productDao.findOne(id);
		
		BeanUtils.copyProperties(productEntity, product);
		
		return product;
		
	}
	
	public Product getProductsNull() {
		
		
		return null;
		
	}

	public Product getProductsException() throws ProductServiceException {
		
		
		throw new ProductServiceException();
		
	}

	/**
	 * Following method will give product details of particular name
	 * @param name
	 * @return list of products
	 */
	public List<Product> getProductsByName(String name) {
		List<Product> listProduct = new ArrayList<Product> ();
		
		List<ProductEntity> listProductEntity = productDao.findByProductName(name);
		for(ProductEntity productEntity :listProductEntity)
		{
			Product product = new Product();
			BeanUtils.copyProperties(productEntity, product);
			listProduct.add(product);
		}
		
		return listProduct;
		
	}

	/**
	 * Following method delete a particular product based on Id passed
	 * @param Id
	 * @return deleted product details
	 */
	public Product deleteProduct(int id) {
		Product product = null;
		
		ProductEntity productEntity = productDao.findOne(id);
		if(productEntity != null) {
			productDao.delete(productEntity);
			
			product = new Product();
			BeanUtils.copyProperties(productEntity, product);
		}
		
		return product;
		
	}
}
