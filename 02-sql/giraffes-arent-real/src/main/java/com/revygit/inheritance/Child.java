package com.revygit.inheritance;

public class Child extends Parent{

	private boolean defects;
	private static int recesstime;
	
	{
		System.out.println("this is the childs first instance block");
	}
	
	static {
		System.out.println("this is the childs static block");
		recesstime = 100;
	}
	
	public Child() {
		System.out.println("this is the no arg child constructor");
	}
	
	public Child(boolean defects, int age, String name) {
		super(age, name);
		this.defects=defects;
		System.out.println("in the childs all arg constructor");
	}
	
	{
		System.out.println("this is the childs second instance block");
	}
}
