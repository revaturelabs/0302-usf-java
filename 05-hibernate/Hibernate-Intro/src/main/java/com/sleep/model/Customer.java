package com.sleep.model;

import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

//just to show that you dont need all the annotations that are in the other class
@Entity
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private boolean child;
	private double paid;
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "rest_cust")
	private Restaurant restaurant;

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

	public boolean isChild() {
		return child;
	}

	public void setChild(boolean child) {
		this.child = child;
	}

	public double getPaid() {
		return paid;
	}

	public void setPaid(double paid) {
		this.paid = paid;
	}

	public Restaurant getRestaurant() {
		return restaurant;
	}

	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}

	public Customer(int id, String name, boolean child, double paid, Restaurant restaurant) {
		super();
		this.id = id;
		this.name = name;
		this.child = child;
		this.paid = paid;
		this.restaurant = restaurant;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", child=" + child + ", paid=" + paid + ", restaurant="
				+ restaurant + "]";
	}

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public int hashCode() {
		return Objects.hash(child, id, name, paid, restaurant);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		return child == other.child && id == other.id && Objects.equals(name, other.name)
				&& Double.doubleToLongBits(paid) == Double.doubleToLongBits(other.paid)
				&& Objects.equals(restaurant, other.restaurant);
	}

}
