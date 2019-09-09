package com.singleton.factory;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


public class Runner {
public static void main(String[] args) {
	SessionFactory sf=HibernateUtil.getSessionFactory();
	
	Session session=sf.openSession();
	Transaction tx=session.beginTransaction();
	Student s1=new Student();

	s1.setName("mukesh");
	s1.setBranch("MCA");
	session.save(s1);
	Address ad=new Address();
	ad.setCity("Ranchi");
	ad.setPin("834001");
	ad.setState("Jharkhand");
	//session.save(ad);
	s1.setAdderss(ad);
	tx.commit();
}
}
