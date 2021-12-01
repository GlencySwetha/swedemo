package com.boot.demo.SpringBootMVCDemo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.demo.SpringBootMVCDemo.database.BookRepository;
import com.boot.demo.SpringBootMVCDemo.pojo.Book;

@Service
public class BookService {
	
	@Autowired
	private BookRepository bookrepositry;
	
	public boolean insertbook(Book book) {
		if(this.bookrepositry.existsById(book.getId()))
		{
			return false;
		}
		this.bookrepositry.save(book);
		return true;
	}
	
	public Book getbookById(int id) throws Exception {
		return
		this.bookrepositry.findById(id).orElseThrow(()-> new Exception("book id dosen't exist"));
	}
	
	public boolean deleteById(int id) throws Exception{
		try {
		this.bookrepositry.deleteById(id);
		}
		catch(Exception e)
		{
			throw new Exception("Could not delete book with id "+id);
		}
		System.out.println("Deleted");
		return true;
	}
	public boolean updateBook(Book book)
	{
		if(!this.bookrepositry.existsById(book.getId()))
		{
			return false;
		}
		this.bookrepositry.save(book);
		return true;
	}
	public List<Book> getAllBooks()
	{
		List<Book> list = new ArrayList<>();
		this.bookrepositry.findAll().forEach(book-> list.add(book));
		return list;
	}
	public List<Book> getAllBooksByAuthor(int aid)
	{
		
		return this.bookrepositry.findByAuthorId(aid);
		
	}
}

