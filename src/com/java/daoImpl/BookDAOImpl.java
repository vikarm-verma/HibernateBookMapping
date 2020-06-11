package com.java.daoImpl;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.java.dao.BookDao;
import com.java.model.Book;
import com.java.util.HibernateUtil;

public class BookDAOImpl implements BookDao {
	public List<Book> getAllBooks() {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		List<Book> allBooks =(List<Book>) session.createQuery("from Book").list();
//		Iterator itr = allBooks.iterator();
//		while(itr.hasNext()){
////     	   Book[] obj = (Book[]) itr.next();
//////		   //now you have one array of Object for each row
//////		 //  Integer bookId = Integer.parseInt(String.valueOf(obj[0])); // don't know the type of column CLIENT assuming String 
//////		  // Integer studentId = Integer.parseInt(String.valueOf(obj[1])); //SERVICE assumed as int
////		   String bookName = String.valueOf(obj[0]);
////		   String studentName = String.valueOf(obj[1]);
//////		   //same way for all obj[2], obj[3], obj[4]
//			System.out.println(itr.next());
//			Book [] obj = (Book[])itr.next();
//			
//		}
		tx.commit();
		return allBooks;
}
}