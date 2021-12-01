package com.boot.demo.SpringBootMVCDemo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.demo.SpringBootMVCDemo.database.AuthorRepositry;
import com.boot.demo.SpringBootMVCDemo.pojo.Author;

@Service
public class AuthorService {
	
	@Autowired
	private AuthorRepositry authorrepositry;
	
	public boolean insertAuthor(Author author) {
		if(this.authorrepositry.existsById(author.getId()))
		{
			return false;
		}
		this.authorrepositry.save(author);
		return true;
	}
	
	public Author getAuthorById(int id) throws Exception {
		return
		this.authorrepositry.findById(id).orElseThrow(()-> new Exception("Author id dosen't exist"));
	}
	
	public boolean deleteById(int id) throws Exception{
		try {
		this.authorrepositry.deleteById(id);
		}
		catch(Exception e)
		{
			throw new Exception("Could not delete author with id "+id);
		}
		System.out.println("Deleted");
		return true;
	}
	public boolean updateAuthor(Author author)
	{
		if(!this.authorrepositry.existsById(author.getId()))
		{
			return false;
		}
		this.authorrepositry.save(author);
		return true;
	}
	public List<Author> getAllAuthors()
	{
		List<Author> list = new ArrayList<Author>();
		this.authorrepositry.findAll().forEach(author-> list.add(author));
		return list;
	}
	public List<Author> getAuthorsByGenre(String genres)
	{
		return this.authorrepositry.findByGenres(genres);
	}
}
