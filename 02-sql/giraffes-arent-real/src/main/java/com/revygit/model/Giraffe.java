package com.revygit.model;

public class Giraffe {

	private int id;
	private String name;
	private boolean exists;

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

	public boolean isExists() {
		return exists;
	}

	public void setExists(boolean exists) {
		this.exists = exists;
	}

	public Giraffe(int id, String name, boolean exists) {
		super();
		this.id = id;
		this.name = name;
		this.exists = exists;
	}

	public Giraffe() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Giraffe [id=" + id + ", name=" + name + ", exists=" + exists + "]\n";
	}

}
