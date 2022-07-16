package com.prowings.by_xml;

public class Car {
	
	int model;
	String company;
	Engine eng1;
	
	public Car() {
		super();
	}
	
	public Car(int model, String company, Engine eng) {
		super();
		this.model = model;
		this.company = company;
		this.eng1 = eng;
	}

	@Override
	public String toString() {
		return "Car [model=" + model + ", company=" + company + ", eng=" + eng1 + "]";
	}
	
	public int getModel() {
		return model;
	}
	public void setModel(int model) {
		this.model = model;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public Engine getEng1() {
		return eng1;
	}
	public void setEng1(Engine eng) {
		this.eng1 = eng;
	}
	
}
