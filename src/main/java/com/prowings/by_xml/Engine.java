package com.prowings.by_xml;

public class Engine {
	
	int cc;
	String type;
	
	public Engine() {
		super();
	}
	
	public Engine(int cc, String type) {
		super();
		this.cc = cc;
		this.type = type;
	}
	
	@Override
	public String toString() {
		return "Engine [cc=" + cc + ", type=" + type + "]";
	}
	
	public int getCc() {
		return cc;
	}
	public void setCc(int cc) {
		this.cc = cc;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
}
