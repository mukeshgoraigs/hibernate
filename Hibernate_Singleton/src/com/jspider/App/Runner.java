package com.jspider.App;

public class Runner {
	public static void main(String[] args) {
		Student s1=Student.getStudent();
		s1.name="muku";
		Student s2=Student.getStudent();
		s2.name="muku";
		if(s1==s2) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		if(s1.equals(s2)) {
			System.out.println("true");
		}
		else {
			System.out.println("else");
		}
	}
}
