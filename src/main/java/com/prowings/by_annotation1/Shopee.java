package com.prowings.by_annotation1;

import org.springframework.beans.factory.annotation.Autowired;

public class Shopee {
	
	String name;
	String street;
	Mobile mobile;
	
	public Shopee() {
		super();
	}
	
	public Shopee(String name, String street, Mobile mobile) {
		super();
		this.name = name;
		this.street = street;
		this.mobile = mobile;
	}
	
	@Override
	public String toString() {
		return "Shopee [name=" + name + ", street=" + street + ", mobile=" + mobile + "]";
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public Mobile getMobile() {
		return mobile;
	}
	
	@Autowired
	public void setMobile(Mobile mobile) {
		this.mobile = mobile;
	}
}
