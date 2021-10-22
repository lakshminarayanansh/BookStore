package com.test.bookstore;

import javax.persistence.*;

@Entity
@Table(name ="books")
public class Book {

	@Id
	private String id;
	private String name;
	private String description;
	private String auther;
	private String type;
	private String price;
	private String ISBN;
	
	public Book(String name, String description, String auther, String type, String price, String ISBN) {
		this.name=name;
		this.description=description;
		this.auther=auther;
		this.type=type;
		this.price=price;
		this.ISBN=ISBN;
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getAuther() {
		return auther;
	}
	public void setAuther(String auther) {
		this.auther = auther;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	
	
	
}
