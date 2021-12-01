package com.boot.demo.SpringBootMVCDemo.database;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.boot.demo.SpringBootMVCDemo.pojo.Author;

public interface AuthorRepositry extends CrudRepository<Author , Integer> {
	public List<Author> findByGenres(String genres);

}
