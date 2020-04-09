package com.example.model;

import javax.xml.bind.annotation.XmlRootElement;

import com.sun.xml.internal.txw2.annotation.XmlElement;

@XmlRootElement(name="Clown")
public class Clown {

	private int id;
	private String name;
	private boolean scary;

	@XmlElement
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	@XmlElement
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@XmlElement
	public boolean isScary() {
		return scary;
	}

	public void setScary(boolean scary) {
		this.scary = scary;
	}

	public Clown(int id, String name, boolean scary) {
		super();
		this.id = id;
		this.name = name;
		this.scary = scary;
	}

	public Clown() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Clown [id=" + id + ", name=" + name + ", scary=" + scary + "]";
	}

}
