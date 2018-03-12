package com.product.globalmart1.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.product.globalmart1.model.Product;
import com.product.globalmart1.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	ProductService productService;
	
	final Logger logger = LoggerFactory.getLogger(ProductController.class);
	
	@RequestMapping("/getProducts")
	public List<Product> getAllProducts() {
		logger.debug("I am in getAllProducts");
		return productService.getProductDetails();
	}
	
	@RequestMapping(value="/products/addProduct",
			method=RequestMethod.POST,
			consumes=MediaType.APPLICATION_JSON_VALUE,
			produces=MediaType.TEXT_HTML_VALUE)
	public ResponseEntity<String> addProduct( @RequestBody Product product){
		System.out.println(" inside add------");
		int id= productService.addProduct(product);
		System.out.println("[id]:"+id);
		return new ResponseEntity<String>("Product added successfully with id:"+id,HttpStatus.CREATED);
	}
	
	@RequestMapping(value="/products/getProductByType/{type}",method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Product>> getProductByType(@PathVariable("type") String type) {
		
		System.out.println(" inside find by type " + type);
		
		List<Product> listProduct = productService.getProductByType(type);
		
		if(listProduct.size() > 0)
		{
			return new ResponseEntity<List<Product>>(listProduct,HttpStatus.OK);
		}
		else
		{
			return new ResponseEntity<List<Product>>(HttpStatus.NOT_FOUND);
		}
	}
	
	
	@RequestMapping(value="/products/deleteProduct/{id}",
			method=RequestMethod.DELETE,
			consumes=MediaType.TEXT_PLAIN_VALUE,
			produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> deleteProduct(@PathVariable("id") int id){
		Product product= productService.deleteProduct(id);
		if(product==null){
			return new ResponseEntity<String>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		System.out.println("Removed: "+product);
		return new ResponseEntity<String>(HttpStatus.OK);
	}
}
