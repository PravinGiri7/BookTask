package com.BookS.Controller;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.BookS.Entity.Book;
import com.BookS.Service.BookService;

@RestController
public class BookController {
	
	@Autowired
	BookService service;
	
	@PostMapping("/addBook")
public String insertIntBook(@RequestBody  List<Book> bk) {
	
	return service.insertIntBook(bk);
	
}
	@GetMapping("/getBook")
public 	List<Book> getBook() {
	return  service.getBook();
		
	}
	
	@PostMapping("/updBook")
	public String updateBook(Book b){
		return service.updateBook(b);
		
	}
	
	@DeleteMapping("/deleteBookByid")
public 	String deleteBook(int bid) {
		return service.deleteBook(bid);
	}
	
	@GetMapping("/getBookName/{bid}")
	public List<Book> getBookbyName(@PathVariable String bid){
		return service.getBookbyName(bid);
	}

	@PutMapping("/updaBookbyid/{bid}")
	public String updateBookByid(@PathVariable Book bid) {
		return service.updateBookByid(bid);
	}
	
}
