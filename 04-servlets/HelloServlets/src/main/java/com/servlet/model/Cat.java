package com.servlet.model;

public class Cat {

	private int id;
	private String name;
	private boolean evil;

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

	public boolean isEvil() {
		return evil;
	}

	public void setEvil(boolean evil) {
		this.evil = evil;
	}

	public Cat(int id, String name, boolean evil) {
		super();
		this.id = id;
		this.name = name;
		this.evil = evil;
	}

	public Cat() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "{ "+
				"\"id\": " + id + ", "+
				"\"name\": \"" + name + "\", "+
				"\"evil\": " + evil + " "+
				"}";
	}

}
