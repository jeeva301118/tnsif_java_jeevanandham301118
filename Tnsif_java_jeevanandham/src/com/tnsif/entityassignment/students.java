package com.tnsif.entityassignment;

public class students {
	// Fields
	int id;
	String name;
	double score;

	public static void main(String[] args) {

		students c1 = new students();
		c1.id = 101;
		c1.name = "Rishi";
		c1.score = 6.75;
		System.out.println("Id: " + c1.id + " Name: " + c1.name + " Score: " + c1.score);

		students c2 = new students();
		c2.id = 102;
		c2.name = "Veeravel";
		c2.score = 6.85;
		System.out.println("Id: " + c2.id + " Name: " + c2.name + " Score: " + c2.score);

		students c3 = new students();
		c3.id = 103;
		c3.name = "Thanushram";
		c3.score = 7.45;
		System.out.println("Id: " + c3.id + " Name: " + c3.name + " Score: " + c3.score);
	}
}