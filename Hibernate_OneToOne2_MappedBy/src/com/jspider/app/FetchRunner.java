package com.jspider.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchRunner {
	public static void main(String[] args) {
		
		SessionFactory factory=HibernateUtil.getSessionFactory();
		Session session=factory.openSession();
		Girl girl=session.get(Girl.class, 1 );
		Boy boy=session.get(Boy.class, 1 );
		System.out.println(boy);
		System.out.println(girl);
	}
}
