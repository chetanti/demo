package com.product.globalmart.service;

public class ProductServiceException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8563842266059016030L;

	public ProductServiceException() {
		super();
	}
	
	public ProductServiceException(final String message) {
		super(message);
	}
}
