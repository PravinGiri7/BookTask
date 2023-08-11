package com.BookS.Dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.BookS.Entity.Book;


@Repository
public class BookDao {
	@Autowired
	SessionFactory sf;	
	
//............insert.................
		public String insertIntBook(List<Book> bk) {
			Session session=sf.openSession();
			Transaction tr=session.beginTransaction();
			for (Book book : bk) {
					session.save(book);
			}
		    tr.commit();
			return "Project  Saved..... ";
		}
		//............get.................
		public List<Book> getBook() {
			Session session=sf.openSession();
			Criteria cr=session.createCriteria(Book.class);
			return cr.list() ;
			}
		//..................Update..............
		public String updateBook(Book b){
			Session session=sf.openSession();
			Transaction tr=session.beginTransaction();
			session.update(b);
			tr.commit();
			session.close();
			return "Book Updated..............";
			
		}
		
		
		//................delte.......................
		public String deleteBook(int bid) {
			Session session = sf.openSession();
			Transaction tr = session.beginTransaction();
			Book bk = session.get(Book.class, bid);

			session.delete(bk);
			tr.commit();
			return "Book Deleted by id Successfully.....";

		}
		
		//............get Byid............
		public List<Book> getBookbyName(String bid) {
			Session session = sf.openSession();
			Criteria cr = session.createCriteria(Book.class);
			cr.add(Restrictions.eqOrIsNull("bid", bid));
			List<Book> list = cr.list();
			return list;

		}
		public String updateBookByid(Book bid){
			Session session=sf.openSession();
			Criteria cr = session.createCriteria(Book.class);
			cr.add(Restrictions.eqOrIsNull("bid", bid));
			session.update(bid);
			session.close();
			return "Book Updated..............";
			
		}

		
}
