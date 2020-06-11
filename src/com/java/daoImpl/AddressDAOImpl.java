package com.java.daoImpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.java.model.Address;
import com.java.util.HibernateUtil;
import com.java.dao.AddressDao;

public class AddressDAOImpl implements AddressDao {

	@Override
	public List<Address> getAllAddress() {
		// TODO Auto-generated method stub
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		List<Address> allCourses = session.createQuery("from Address").list();
		tx.commit();
		return allCourses;
	}

}
