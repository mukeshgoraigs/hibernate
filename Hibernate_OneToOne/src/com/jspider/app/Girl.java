package com.jspider.app;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Girl implements Serializable{
	public Boy getBoy() {
		return boy;
	}
	public void setBoy(Boy boy) {
		this.boy = boy;
	}
	@Override
	public String toString() {
		return "Girl [gid=" + gid + ", name=" + name + ", age=" + age + "]";
	}
	@OneToOne
	Boy boy;
	public int getGid() {
		return gid;
	}
	public void setGid(int gid) {
		this.gid = gid;
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
	@Id
private int gid;
private String name;
private int age;


}
