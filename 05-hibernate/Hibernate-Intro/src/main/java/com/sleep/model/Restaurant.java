package com.sleep.model;

import java.util.Objects;

public class Restaurant {

	private int id;
	private String name;
	private boolean fastFood;
	private double rating;

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

	public boolean isFastFood() {
		return fastFood;
	}

	public void setFastFood(boolean fastFood) {
		this.fastFood = fastFood;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public Restaurant(int id, String name, boolean fastFood, double rating) {
		super();
		this.id = id;
		this.name = name;
		this.fastFood = fastFood;
		this.rating = rating;
	}

	public Restaurant() {
		super();
	}

	@Override
	public String toString() {
		return "Restaurant [id=" + id + ", name=" + name + ", fastFood=" + fastFood + ", rating=" + rating + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(fastFood, id, name, rating);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Restaurant other = (Restaurant) obj;
		return fastFood == other.fastFood && id == other.id && Objects.equals(name, other.name)
				&& Double.doubleToLongBits(rating) == Double.doubleToLongBits(other.rating);
	}

}
