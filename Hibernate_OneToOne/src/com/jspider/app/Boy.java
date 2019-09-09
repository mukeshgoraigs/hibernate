package com.jspider.app;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class Boy implements Serializable {
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public Girl getGirl() {
		return girl;
	}
	public void setGirl(Girl girl) {
		this.girl = girl;
	}
	@Id
	private int bid;
	private String name;
	private int age;
	@OneToOne
	private Girl girl;
	
	@Override
	public String toString() {
		return "Runner [id=" + bid + ", name=" + name + ", age=" + age + "]";
	}
	public int getId() {
		return bid;
	}
	public void setId(int id) {
		this.bid = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
