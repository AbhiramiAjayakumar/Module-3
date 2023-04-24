package com.ust.rest.resource;

import java.math.BigDecimal;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

public  @ Data class Product {

@Getter
@Setter
	private  long productID;
	private  String name;
	private String description;
	private BigDecimal price;
	private  int qty;
	
	 /*public int getQty() { return qty; } public void setQty(int qty) { this.qty =
	 qty; } public long getProductID() { return productID; } public void
	 setProductID(long productID) { this.productID = productID; } public String
	getName() { return name; } public void setName(String name) { this.name =
	 name; } public String getDescription() { return description; } public void
	setDescription(String description) { this.description = description; } public
	 BigDecimal getPrice() { return price; } public void setPrice(BigDecimal
	 price) { this.price = price; }
	 

*/
}