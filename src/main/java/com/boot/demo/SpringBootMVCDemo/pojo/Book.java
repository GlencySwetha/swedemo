package com.boot.demo.SpringBootMVCDemo.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Book {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name = "bookid")
	private int id;
	private String title;
	private int year;
	private double price;
	@OneToOne
	private Author author;
	
	public Book() {
		
	}
	
	public Book(int id, String title, int year, double price, Author author) {
		super();
		this.id = id;
		this.title = title;
		this.year = year;
		this.price = price;
		this.author = author;
	}
	public Book(String string, int i, int j, Author a) {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", year=" + year + ", price=" + price + ", author=" + author
				+ "]";
	}
	
	

}