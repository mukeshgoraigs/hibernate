package com.cartoon.app;

import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MainRunner {

	public static void main(String[] args) {


	//1st step is configure the app
		Configuration cfg=new Configuration();
		cfg.configure();

		//2nd step to make a connection
		SessionFactory factory=cfg.buildSessionFactory();
		
		//create session and do crud operation
		Session session=factory.openSession();
		
		org.hibernate.Transaction transaction=session.beginTransaction();
		
		Cartoon c=new Cartoon();
		//c.setCartoonId(1);
		c.setCartoonName("tom and jerry");
		c.setFavChar("Tom");
		
		session.save(c);
		transaction.commit();
	}

}
