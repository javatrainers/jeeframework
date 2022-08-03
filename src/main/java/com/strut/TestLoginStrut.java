package com.strut;

import java.io.InputStream;
import java.io.StringBufferInputStream;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.ServletRequestAware;

// simple pojo business /model program
public class TestLoginStrut implements ServletRequestAware {
	// BUSINESS LOGIC
	public String authenticate() {
		fruits.add("mango");fruits.add("banana");fruits.add("grapes");
		vegetables.add("carrot");vegetables.add("onion");vegetables.add("tomato");
		greetingName="Mr java jee";
		if(userid.equals("java") && password.equals("struts"))
			return "correct";
		else
		{
			inputStream = new StringBufferInputStream("failed login");
			return "wrong";
		}
	}
	public ArrayList<String> fruits=new ArrayList<String> ();
	public ArrayList<String> getFruits() {
		return fruits;
	}
	public void setFruits(ArrayList<String> fruits) {
		this.fruits = fruits;
	}
	public ArrayList<String> getVegetables() {
		return vegetables;
	}
	public void setVegetables(ArrayList<String> vegetables) {
		this.vegetables = vegetables;
	}
	public ArrayList<String> vegetables=new ArrayList<String> ();
	
	
	
	// FORM BEAN
	public String greetingName;
	
	public String getGreetingName() {
		return greetingName;
	}
	public void setGreetingName(String greetingName) {
		this.greetingName = greetingName;
	}
	public String userid;
	public String password;
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	// FORM BEAN
	HttpServletRequest servletaccess;
	public InputStream inputStream;
	 
	
	@Override
	public void setServletRequest(HttpServletRequest request) {
		servletaccess=request;
	}

}
