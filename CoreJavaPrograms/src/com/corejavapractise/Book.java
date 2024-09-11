package com.corejavapractise;

public class Book 
{
	
	String author = "Alan Walkar";
	int cost;
	
	public Book(String author, int cost) {
		this.author= author;//Cannot override the final method from Heart
		this.cost= cost;
	}
	
//	public String getColor() {
//		//Cannot override the final method from Heart
//	}

	public String getAuthor() {
		return author;
	}

	public int getCost() {
		return cost;
	}
	
		

}
