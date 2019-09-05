package com.jspider.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainRunner {
	public static void main(String args[]) {
		Configuration cfg=new Configuration();
		cfg.configure();
		
		SessionFactory s=cfg.buildSessionFactory();
		Session session=s.openSession();
		
		Transaction t=session.beginTransaction();
		Student s1=new Student();
		//s1.setRoll(1);
		s1.setName("mukesh");
		s1.setBranch("MCA");
		session.save(s1);
		Student s2=new Student();

		s1.setName("pawan");
		s1.setBranch("MCA");
		session.save(s2);
		Student s3=new Student();

		s1.setName("amit");
		s1.setBranch("MCA");

		session.save(s3);
		t.commit();
	}
}
