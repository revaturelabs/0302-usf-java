package com.project.model;

import java.util.Objects;

public class Giraffe implements Comparable<Giraffe>{

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

	@Override
	public String toString() {
		return "Giraffe [id=" + id + ", name=" + name + ", exists=" + exists + "]";
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
	public int hashCode() {
		return Objects.hash(exists, id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Giraffe other = (Giraffe) obj;
		return exists == other.exists && id == other.id && Objects.equals(name, other.name);
	}

	@Override
	public int compareTo(Giraffe o) {
		return this.name.compareTo(o.getName());
	}

}
