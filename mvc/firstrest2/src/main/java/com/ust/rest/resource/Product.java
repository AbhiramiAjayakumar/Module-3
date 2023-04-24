package com.ust.rest.resource;

import java.math.BigDecimal;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

public  @Data class Product {


	private @Setter @Getter long productID;
	private@Setter @Getter  String name;
	private @Setter @Getter String description;
	private @Setter @Getter   BigDecimal price;
	private @Setter @Getter  int qty;
	
	
	/*
	 * 
	 * 
	 * public int getQty() { return qty; } public void setQty(int qty) { this.qty =
	 * qty; } public long getProductID() { return productID; } public void
	 * setProductID(long productID) { this.productID = productID; } public String
	 * getName() { return name; } public void setName(String name) { this.name =
	 * name; } public String getDescription() { return description; } public void
	 * setDescription(String description) { this.description = description; } public
	 * BigDecimal getPrice() { return price; } public void setPrice(BigDecimal
	 * price) { this.price = price; }
	 */
}
