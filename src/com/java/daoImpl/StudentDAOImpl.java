package com.java.daoImpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.java.dao.StudentDao;
import com.java.model.Student;
import com.java.util.HibernateUtil;

public class StudentDAOImpl implements StudentDao{
	public List<Student> getAllStudents() {
	SessionFactory sf = HibernateUtil.getSessionFactory();
	Session session = sf.openSession();
	Transaction tx = session.beginTransaction();
	List<Student> allStudents = session.createQuery("from Student").list();
	tx.commit();
	return allStudents;
	}
}
