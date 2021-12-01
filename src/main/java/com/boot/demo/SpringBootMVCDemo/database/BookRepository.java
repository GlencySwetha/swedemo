package com.boot.demo.SpringBootMVCDemo.database;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.boot.demo.SpringBootMVCDemo.pojo.Book;



public interface BookRepository extends CrudRepository<Book, Integer>{

	
	
	public List<Book> findByAuthorId(int id);
}
 


