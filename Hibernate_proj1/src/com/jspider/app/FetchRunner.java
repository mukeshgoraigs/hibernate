package com.jspider.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchRunner {
	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure();
		
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		Student student=session.get(Student.class, 1 );
		System.out.println(student);
	}
}
