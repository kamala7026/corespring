package com.demo.beanfactory_injecting_member_and_constructor;

public class Circle {
	private String type;
	public void draw(){
		 System.out.println("This is a Circle");
	 }
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
}
