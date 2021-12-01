package com.boot.demo.SpringBootMVCDemo.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Author {
	@Id
	private int id;
	private String name;
	private String genres;
	
	public Author() {
		System.out.println("Author Default");
	}
	
	public Author(int id, String name, String genres) {
		super();
		this.id = id;
		this.name = name;
		this.genres = genres;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGenres() {
		return genres;
	}
	public void setGenres(String genres) {
		this.genres = genres;
	}

	@Override
	public String toString() {
		return "Author [id=" + id + ", name=" + name + ", genres=" + genres + "]";
	}
	
	

}

