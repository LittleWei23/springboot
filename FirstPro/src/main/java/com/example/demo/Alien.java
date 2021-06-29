package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.util.SystemPropertyUtils;

@Component

public class Alien {
	private int aid;
	private String aname;
	private String tech;
	@Autowired // search by type - here, search for type "Laptop"
	@Qualifier("lap1") //search by name - here, search by component name "lap1"
	private Laptop laptop;
	
	
	
	public Alien() {
		super();
		System.out.println("object created");
	}
	
	
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public String getTech() {
		return tech;
	}
	public void setTech(String tech) {
		this.tech = tech;
	}
	
	
	public String getLaptop() {
		return laptop;
	}


	public void setLaptop(String laptop) {
		this.laptop = laptop;
	}


	public void show(){
		System.out.println("in show");
		laptop.compile();
	}

}
