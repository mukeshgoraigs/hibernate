package com.singleton.factory;

import java.io.Serializable;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student implements Serializable{


	public Address getAdderss() {
		return Adderss;
	}
	public void setAdderss(Address adderss) {
		Adderss = adderss;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int roll;
	private String name;
	private String branch;
	public int getRoll() {
		return roll;
	}
	@Embedded
	private Address Adderss;
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBranch() {
		return branch;
	}
	
	public void setBranch(String branch) {
		this.branch = branch;
	}
	
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", branch=" + branch + "]";
	}
}
