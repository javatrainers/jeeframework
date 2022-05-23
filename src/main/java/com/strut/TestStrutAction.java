package com.strut;

import java.io.InputStream;
import java.io.StringBufferInputStream;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

import com.opensymphony.xwork2.ActionSupport;
import com.spring.beans.ProfileBean;
import com.springdata.UsersEntity;
public class TestStrutAction {
	private static final long serialVersionUID = 1L;

	// form Bean
	// bean - variable with get/set method
	public String strutuid;
	public String getStrutuid() {
		return strutuid;
	}
	public void setStrutuid(String strutuid) {
		this.strutuid = strutuid;
	}
	public String strutpwd;
	public String getStrutpwd() {
		return strutpwd;
	}
	public void setStrutpwd(String strutpwd) {
		this.strutpwd = strutpwd;
	}
	// business logic methods
	public String login() {
		myList1.add("mango"); myList1.add("apple"); myList1.add("banana");
		myList2.add("onion"); myList2.add("tomato"); myList2.add("potato");
		if(strutuid.equals("john") && strutpwd.equals("john123") ) {
			fName="johnathn";
			lName="doe";
			address="ny";
			return "success";
		}
		else if(strutuid.equals("jane") && strutpwd.equals("jane123") ) {
			fName="jane";
			lName="joe";
			address="vegas";
			return "success";
		}
		else
			return "failure";
	}
	
	public String fName;
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String lName;
	public String address;
	public ArrayList<String> myList1=new ArrayList<String> ();
	public ArrayList<String> myList2=new ArrayList<String> ();
	public ArrayList<String> getMyList2() {
		return myList2;
	}
	public void setMyList2(ArrayList<String> myList2) {
		this.myList2 = myList2;
	}
	public ArrayList<String> getMyList1() {
		return myList1;
	}
	public void setMyList1(ArrayList<String> myList1) {
		this.myList1 = myList1;
	}
	

}