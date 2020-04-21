package com.orm.model;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;

@Entity
@Table
public class LightSabers {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int id;

	@Column
	private String color;

	@Column(unique = true)
	@NotNull
	private String owner;

	@Column
	@DecimalMax(value = "3")
	@Max(value = 5)
	private double length;
	
	
	
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public double getLength() {
		return length;
	}

	public void setLength(float length) {
		this.length = length;
	}

	public LightSabers(int id, String color, String owner, double length) {
		super();
		this.id = id;
		this.color = color;
		this.owner = owner;
		this.length = length;
	}

	public LightSabers() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "LightSabers [id=" + id + ", color=" + color + ", owner=" + owner + ", length=" + length + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(color, id, length, owner);
	}

	

}
