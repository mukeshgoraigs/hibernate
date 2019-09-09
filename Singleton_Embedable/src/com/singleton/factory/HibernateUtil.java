package com.singleton.factory;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private static SessionFactory factory;
	
	static {
		Configuration cfg=new Configuration();
		cfg.configure();
		factory=cfg.buildSessionFactory();
		System.out.println("Session factory");
	}
	public static SessionFactory getSessionFactory() {
		return factory;
	}
	private HibernateUtil(){
		super();
	}
}
