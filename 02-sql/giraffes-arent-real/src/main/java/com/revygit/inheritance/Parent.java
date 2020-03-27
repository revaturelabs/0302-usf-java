package com.revygit.inheritance;

public class Parent {

	private static int instances;
	private int age;
	private String name;
	
	{
		System.out.println("this is the first instance block");
	}
	
	static {
		instances=100;
		System.out.println("this is the parent static block");
	}
	
	public Parent() {
		System.out.println("this is a no arg constructor...not the default one");
	}
	public Parent(int age, String name) {
		System.out.println("this is the all arg constructor");
		this.age=age;
		this.name=name;
	}
	
	{
		System.out.println("this is the second instance block");
	}
}
