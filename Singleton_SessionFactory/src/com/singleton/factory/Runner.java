package com.singleton.factory;

import org.hibernate.SessionFactory;

public class Runner {
public static void main(String[] args) {
	SessionFactory sf=HibernateUtil.getSessionFactory();
	System.out.println("------------");
	SessionFactory sf2=HibernateUtil.getSessionFactory();
	System.out.println("------------");
	System.out.println(sf==sf2);
}
}
