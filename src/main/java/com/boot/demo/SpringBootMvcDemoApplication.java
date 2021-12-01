package com.boot.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.boot.demo.SpringBootMVCDemo.database.AuthorRepositry;
import com.boot.demo.SpringBootMVCDemo.database.BookRepository;
import com.boot.demo.SpringBootMVCDemo.pojo.Author;
import com.boot.demo.SpringBootMVCDemo.pojo.Book;

@SpringBootApplication
public class SpringBootMvcDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMvcDemoApplication.class, args);
	}
	
	@Autowired
	private AuthorRepositry authorrepo;
	
	@Autowired
	private BookRepository bookrepo;
	
	@Bean
	public void insertData()
	{
		System.out.println("inserting....");
		Author a = new Author(3, "Shalini", "Thriller");
		Author a1 = new Author(2, "PQR", "Suspense");
		
		Book b1 = new Book("Dhoom",2019,1234,a);
		Book b2 = new Book("Twilight",2015,1000,a);
		Book b3 = new Book("Action Jack",2000,234,a);
		Book b4 = new Book("Got you",2019,676,a);
		Book b5 = new Book("What happened",2019,800,a1);
		Book b6 = new Book("Lets see",2015,567,a1);
		
		authorrepo.save(a);
		authorrepo.save(a1);
		
		bookrepo.save(b1);
		bookrepo.save(b2);
		bookrepo.save(b3);
		bookrepo.save(b4);
		bookrepo.save(b5);
		bookrepo.save(b6);
	}

}
