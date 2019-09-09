package com.singleton.factory;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchRunner {
	public static void main(String[] args) {
		
		SessionFactory factory=HibernateUtil.getSessionFactory();
		Session session=factory.openSession();
		Student student=session.get(Student.class, 1 );
		System.out.println(student);
	}
}
