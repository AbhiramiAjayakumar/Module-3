package com.ust.rest.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ust.rest.resource.Product;
import com.ust.rest.services.ProductService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;


@RestController
@RequestMapping("/product/api.2.0")
@Api(value="Product Service  API 2.0",description=" Rest endpoints for product API")
public class ProductResource {
	@Autowired
	ProductService service;

	@GetMapping 

	  @RequestMapping("/retrieve/{productID}") 
	@ApiOperation(value=" Accepts product id returns the Product Entity")

		public ResponseEntity<Product>
	 fetchProduct(@PathVariable long productID) 
	{ 
		return ResponseEntity.ok(service.getProduct(productID)); }
	 
	  @GetMapping
	  
	  @RequestMapping("/retrieve/all") 
	  @ApiOperation(value=" Accepts product id returns the Product Entity")
	  public ResponseEntity <List<Product>>fetchProducts(){
		  List<Product> list=service.getProducts();
	  return ResponseEntity.ok(list); }
	
	@PostMapping
	@RequestMapping(value="/create",consumes=MediaType.APPLICATION_JSON_VALUE,
	produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> addProduct(@RequestBody Product product){
	/*
	 * boolean result=service.add(product); if(result) { return
	 * ResponseEntity.status(HttpStatus.CREATED).body(true);
	 * 
	 * } else return ResponseEntity.status(HttpStatus.CREATED).body(false);
	 * 
	 * 
	 * 
	 */
		Exception exception=null;
		Product tempProduct=null;
		try {
			tempProduct=service.add(product);
			
		}
		catch (Exception e)
		{
			exception=e;
		}
		if(tempProduct!=null)
		{
			return ResponseEntity.status(HttpStatus.CREATED).body(tempProduct);
		}
		else
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(exception);
			
	}
	
	

	
  @PutMapping
  @ApiOperation(value=" Accepts product id returns the Product Entity")
  @RequestMapping(value="/update") public Product updateProduct(@RequestBody Product product) { 
	  return service.updateProduct(product);
	  }

 
  @DeleteMapping
 
  @RequestMapping(value="delete/{productID}")
  @ApiOperation(value=" delete product id ")
  public void deleteProduct(@PathVariable long productID) {
  service.deleteProduct(productID); } 
}
