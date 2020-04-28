package com.example.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Horror {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String title;
	private double rating;
	private boolean scary;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public boolean isScary() {
		return scary;
	}

	public void setScary(boolean scary) {
		this.scary = scary;
	}

	@Override
	public String toString() {
		return "Horror [id=" + id + ", title=" + title + ", rating=" + rating + ", scary=" + scary + "]";
	}

	public Horror(int id, String title, double rating, boolean scary) {
		super();
		this.id = id;
		this.title = title;
		this.rating = rating;
		this.scary = scary;
	}

	public Horror() {
		super();
		// TODO Auto-generated constructor stub
	}

}
