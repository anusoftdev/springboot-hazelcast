package com.anusoft.hazelcast.model;

public class Book {

	private String id;
	private String name;
	private String author;
	private double price;
	private String publisher;
	
	public Book(String id, String name, String author, double price, String publisher) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.price = price;
		this.publisher = publisher;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", author=" + author + ", price=" + price + ", publisher="
				+ publisher + "]";
	}
	
}
