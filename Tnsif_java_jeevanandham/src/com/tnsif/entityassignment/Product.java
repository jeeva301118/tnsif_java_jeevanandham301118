package com.tnsif.entityassignment;

public class Product {

	public static void main(String[] args) {
		ProductName  c1=new ProductName();
		c1.id = 101;
		c1.cname = "Laptop";
		c1.price = "55000";
		System.out.println("Id:"+c1.id+"name:"+c1.cname+" price:"+c1.price);
		ProductName  c2=new ProductName();
		c2.id = 102;
		c2.cname = "Mobile";
		c2.price = "20000";
		System.out.println("Id:"+c2.id+"name:"+c2.cname+" price:"+c2.price);
		ProductName  c3=new ProductName();
		c3.id = 103;
		c3.cname = "Headphone";
		c3.price = "2500";
		System.out.println("Id:"+c3.id+"name:"+c3.cname+" price:"+c3.price);
		
		// TODO Auto-generated method stub

	}

}