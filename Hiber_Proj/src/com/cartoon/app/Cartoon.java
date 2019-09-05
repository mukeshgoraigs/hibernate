package com.cartoon.app;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cartoon implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int cartoonId;
	// generate setter and getter sift alt s then r
	public int getCartoonId() {
		return cartoonId;
	}
	public void setCartoonId(int cartoonId) {
		this.cartoonId = cartoonId;
	}
	public String getCartoonName() {
		return cartoonName;
	}
	public void setCartoonName(String cartoonName) {
		this.cartoonName = cartoonName;
	}
	public String getFavChar() {
		return favChar;
	}
	public void setFavChar(String favChar) {
		this.favChar = favChar;
	}
	private String cartoonName;
	private String favChar;
	
	
	
}
