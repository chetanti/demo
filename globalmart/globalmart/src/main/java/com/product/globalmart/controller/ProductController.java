package com.product.globalmart.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.product.globalmart.model.Product;
import com.product.globalmart.service.ProductService;
import com.product.globalmart.service.ProductServiceException;
import com.product.globalmart.service.ResourceNotFoundException;


@RestController
public class ProductController {

	@Autowired
	ProductService productService;
	
	final Logger logger = LoggerFactory.getLogger(ProductController.class);
	
	//@RequestMapping("/products/getAllProducts")
	@GetMapping("/products/getAllProducts")
	public List<Product> getAllProducts() {
		
		return productService.getProductDetails();
	}
	
	@RequestMapping(value="/products/addProduct",method=RequestMethod.POST,consumes=MediaType.APPLICATION_JSON_VALUE,produces=MediaType.TEXT_HTML_VALUE)
	//@PostMapping("/products/addProduct")
	public ResponseEntity<String> addProduct( @RequestBody Product product){
		
		int id= productService.addProduct(product);
		
		return new ResponseEntity<String>("Product added successfully with id:"+id,HttpStatus.CREATED);
	}
	
	//@RequestMapping(value="/products/getProductByType/{type}",method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	@GetMapping("/products/getProductByType/{type}")
	public ResponseEntity<List<Product>> getProductByType(@PathVariable("type") String type) {
		
		List<Product> listProduct = productService.getProductsByType(type);
		
		if(listProduct.size() > 0)
		{
			return new ResponseEntity<List<Product>>(listProduct,HttpStatus.OK);
		}
		else
		{
			return new ResponseEntity<List<Product>>(HttpStatus.NOT_FOUND);
		}
	}
	
	@RequestMapping(value="/products/getProductById/{id}",method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Product> getProductById(@PathVariable("id") int id) throws ResourceNotFoundException, ProductServiceException {
		
		Product product = productService.getProductsById(id);
		
		if(product!= null)
		{
			System.out.println("inside if");
			return new ResponseEntity<Product>(product,HttpStatus.OK);
		}
		else
		{
			
			if(Integer.valueOf(id) instanceof Integer) {
				System.out.println(" inside try ---");
				throw new ResourceNotFoundException("Product not found");
			}
			
			else {
				throw new ProductServiceException("Internal Server Exception while getting exception");
			}
			
			
		}
		
	}
	
	@RequestMapping(value="/products/getProductByName/{name}",method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Product>> getProductByName(@PathVariable("name") String name) {
		
		List<Product> listProduct = productService.getProductsByName(name);
		
		if(listProduct.size() > 0)
		{
			return new ResponseEntity<List<Product>>(listProduct,HttpStatus.OK);
		}
		else
		{
			return new ResponseEntity<List<Product>>(HttpStatus.NOT_FOUND);
		}
	}
	@RequestMapping(value="/products/deleteProduct/{id}",method=RequestMethod.DELETE,produces=MediaType.TEXT_PLAIN_VALUE)
	public ResponseEntity<String> deleteProduct(@PathVariable("id") int id){
		
		Product product= productService.deleteProduct(id);
		
		if(product==null){
			return new ResponseEntity<String>("Product not found", HttpStatus.NOT_FOUND);
		}
		
		return new ResponseEntity<String>(HttpStatus.OK);
	}
}
