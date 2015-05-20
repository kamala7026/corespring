package com.demo.beanfactory_injecting_member_and_constructor;

public class Tringle {
	 private String type;
	 private int height;
	 public Tringle(){
		 
	 }
	 public Tringle(String type){
		 this.type=type;
	 }
	 public Tringle(int height){
		 this.height=height;
	 }
	 public Tringle(String type,int height){
		 this.type=type;
		 this.height=height;
	 }
	 public void draw(){
		 System.out.println("This is a Tringle");
	 }
	public String getType() {
		return type;
	}
	public int getHeight() {
		return height;
	}
	
	/*public void setType(String type) {
		this.type = type;
	}*/
	 
}
