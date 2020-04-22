package com.webby.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Glue {

	@Id
//	this does not work, there is a way to do a custom sequence though. just research
//	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "mySequence")
//	@SequenceGenerator(initialValue = 2, allocationSize = 25, name = "mySequence")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String brand;

	private int stickyLevel;

	private boolean crazy;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getStickyLevel() {
		return stickyLevel;
	}

	public void setStickyLevel(int stickyLevel) {
		this.stickyLevel = stickyLevel;
	}

	public boolean isCrazy() {
		return crazy;
	}

	public void setCrazy(boolean crazy) {
		this.crazy = crazy;
	}

	public Glue(int id, String brand, int stickyLevel, boolean crazy) {
		super();
		this.id = id;
		this.brand = brand;
		this.stickyLevel = stickyLevel;
		this.crazy = crazy;
	}

	public Glue() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Glue [id=" + id + ", brand=" + brand + ", stickyLevel=" + stickyLevel + ", crazy=" + crazy + "]";
	}

}
