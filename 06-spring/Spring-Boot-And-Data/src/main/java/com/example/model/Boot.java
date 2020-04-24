package com.example.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Boot {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private int size;

	private boolean expensive;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public boolean isExpensive() {
		return expensive;
	}

	public void setExpensive(boolean expensive) {
		this.expensive = expensive;
	}

	@Override
	public String toString() {
		return "Boot [id=" + id + ", size=" + size + ", expensive=" + expensive + "]";
	}

	public Boot(int id, int size, boolean expensive) {
		super();
		this.id = id;
		this.size = size;
		this.expensive = expensive;
	}

	public Boot() {
		super();
		// TODO Auto-generated constructor stub
	}

}
