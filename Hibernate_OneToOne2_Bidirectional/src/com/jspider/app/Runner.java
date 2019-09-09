package com.jspider.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Runner{
	public static void main(String[] args) {
		
		SessionFactory sf=HibernateUtil.getSessionFactory();
		
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
	
		Boy b=new Boy();
		b.setAge(23);
		b.setId(1);
		b.setName("abc");
Boy b1=new Boy();
b1.setId(2);
b1.setAge(24);
b1.setName("bcd");

Boy b2=new Boy();
b2.setId(3);
b2.setAge(24);
b2.setName("bcd");

		Girl g=new Girl();
		g.setGid(1);
		g.setAge(24);
		g.setName("nmdsk");
		
		Girl g1=new Girl();
		g1.setGid(2);
		g1.setAge(24);
		g.setName("nmdsk");
		
		Girl g2=new Girl();
		g1.setGid(3);
		g1.setAge(24);
		g1.setName("nmdsk");
		
	b.setGirl(g);
	b1.setGirl(g1);
	b2.setGirl(g2);
	
		session.save(b1);
		session.save(b2);
		session.save(g1);
		session.save(b2);
		session.save(g);
		session.save(b);
		tx.commit();
	}
}
