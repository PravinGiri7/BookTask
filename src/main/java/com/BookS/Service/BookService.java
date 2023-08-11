package com.BookS.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BookS.Dao.BookDao;
import com.BookS.Entity.Book;

@Service
public class BookService {

	@Autowired
	BookDao dao;
	
	
	public String insertIntBook(List<Book> bk) {
		return dao.insertIntBook(bk);
	}
	
	
	public List<Book> getBook() {
		return dao.getBook();
	}
	
	
	public String updateBook(Book b) {
		return dao.updateBook(b);
	}
	
	public String deleteBook(int bid) {
		return dao.deleteBook(bid);
	}
	
	public List<Book> getBookbyName(String bid){
		 return dao.getBookbyName(bid);
	 }
	

	
}
