package com.jspider.App;

public class Student {
	
	String name;
	private static Student student;
	
	static {
		student=new Student();
	}
	public static Student getStudent() {
		return student;
	}
	private Student() {
		super();
	}
}
