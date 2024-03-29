package com.ust.rest.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust.rest.repository.ProductRepository;
import com.ust.rest.resource.Product;
@Service
public class ProductService {
	@Autowired
	ProductRepository repository;
	public Product getProduct(long productID)
	{
		return repository.getProduct(productID);
	}
	
	public ArrayList<Product> getProducts(){
		return repository.getProducts();
	}
	public boolean add(Product product)
	{
		return repository.addProduct(product);
	}
	public Product updateProduct(Product product) {
		return repository.updateProduct(product);
	}
	public void deleteProduct(long productID) {
	repository.deleteProduct(productID);
	}

}
