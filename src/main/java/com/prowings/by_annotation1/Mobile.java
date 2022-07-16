package com.prowings.by_annotation1;

public class Mobile {
	
	String name;
	int prize;
	
	public Mobile() {
		super();
	}
	
	public Mobile(String name, int prize) {
		super();
		this.name = name;
		this.prize = prize;
	}
	
	@Override
	public String toString() {
		return "Mobile [name=" + name + ", prize=" + prize + "]";
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrize() {
		return prize;
	}
	public void setPrize(int prize) {
		this.prize = prize;
	}
}
