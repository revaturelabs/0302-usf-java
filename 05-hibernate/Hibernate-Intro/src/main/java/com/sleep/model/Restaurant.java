package com.sleep.model;

import java.util.Objects;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "restaurant")
public class Restaurant {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "rest_id")
	private int id;
	@Column(name = "rest_name", unique = true)
	private String name;
	@Column(name = "fast_food", nullable = false)
	private boolean fastFood;
	@Column()
	private double rating;

	@OneToMany(mappedBy = "restaurant", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<Customer> customers;

	public Restaurant(int id, String name, boolean fastFood, double rating, Set<Customer> customers) {
		super();
		this.id = id;
		this.name = name;
		this.fastFood = fastFood;
		this.rating = rating;
		this.customers = customers;
	}

	public Set<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(Set<Customer> customers) {
		this.customers = customers;
	}

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
		return "Restaurant [id=" + id + ", name=" + name + ", fastFood=" + fastFood + ", rating=" + rating
				+ ", customers=" + customers + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(customers, fastFood, id, name, rating);
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
		return Objects.equals(customers, other.customers) && fastFood == other.fastFood && id == other.id
				&& Objects.equals(name, other.name)
				&& Double.doubleToLongBits(rating) == Double.doubleToLongBits(other.rating);
	}

}
