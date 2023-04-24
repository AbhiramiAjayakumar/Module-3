package com.ust.rest.services;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ust.rest.repository.ProductRepository;
import com.ust.rest.repository.UserRepository;
import com.ust.rest.resource.Product;
import com.ust.rest.resource.User;
@Service
public class ProductService {
	@Autowired
	ProductRepository productRepository;
	@Autowired
	UserRepository userRepository;
	public Product getProduct(long productID) {
		Optional<Product>optional=productRepository.findById(productID);
		if(optional.isPresent()) {
			return optional.get();
			
		}
		else
			return null;
	}

	/* public Product getProduct(long productID) */
/*	{
		return repository.getProduct(productID);
	}
	*/
	public List<Product> getProducts(){
		return productRepository.findAll();
	}
	
	// working code example 1 REQUIRED
	
	/*
	 * @Transactional(propagation =Propagation.REQUIRED) public Product add(Product
	 * product) { productRepository.save(product); Product productT =
	 * productRepository.save(product); User user=new User(); user.setUserId(5L);
//	 * user.setDateTime(System.currentTimeMillis()+"767676767676767676767676"); User
	 * userT= userRepository.save(user); return productT; }
	 */
	
	//working code example 2 Requires new
	
	
	@Transactional(propagation =Propagation.REQUIRED)
	public Product add(Product product) 
	{ 
	Product productT =productRepository.save(product); 
	addUser();
	
	return productT;
}
	@Transactional(propagation=Propagation.REQUIRES_NEW)
	public boolean addUser()
	{
	User user=new User();
	user.setUserId(5L);
	user.setDateTime(System.currentTimeMillis()+"767676767676767676767676");
	try {
	User userT=userRepository.save(user);}
	catch(Exception e) {
		System.out.println(e);
	}
	return true;
	
		
	}
			 
	
	  public Product updateProduct(Product product) { return
	  productRepository.save(product);
	  }
	  public void deleteProduct(long productID) 
	  { 
		  productRepository.deleteById(productID); }
	 
}
