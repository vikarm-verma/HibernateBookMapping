package com.java.daoImpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.java.dao.BookDetailsDao;
import com.java.model.Book;
import com.java.model.BookDetails;
import com.java.util.HibernateUtil;


public class BookDetailDAOImpl implements BookDetailsDao{
	BookDetails bookDetails;
	Book book;
	@Override
	public void insertAllBookDetail(BookDetails bookDetails) {
		book=new Book();
		// TODO Auto-generated method stub
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		try
		{
		this.bookDetails=bookDetails;
		session.save(this.bookDetails);
		tx.commit();
		System.out.println("data is saved in table");
		}
		catch(Exception e)
		{
			System.out.println("there is some issue in inserting data "+e);
		}
		
	}

}
