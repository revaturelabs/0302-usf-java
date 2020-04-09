package com.example.model;

public class Clown {

	private int id;
	private String name;
	private boolean scary;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

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
