package com.BookS.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Book {
	
	@Id
 private int Bid;
 private String Bname;
 private String publisher;
 private String author;
public int getBid() {
	return Bid;
}
public void setBid(int bid) {
	Bid = bid;
}
public String getBname() {
	return Bname;
}
public void setBname(String bname) {
	Bname = bname;
}
public String getPublisher() {
	return publisher;
}
public void setPublisher(String publisher) {
	this.publisher = publisher;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
@Override
public String toString() {
	return "Book [Bid=" + Bid + ", Bname=" + Bname + ", publisher=" + publisher + ", author=" + author + "]";
}
	

}
