package com.aspect.activity;

import org.springframework.stereotype.Component;

@Component("ryanGotItRight")
public class Singer {

	public int singSong() {
		System.out.println("im singing, im in the middle of a store and im singing, will farrell from elf");
		return 90;
	}
	
	public int yodal() {
		System.out.println("yoda ley yee hoo force, something something green side");
		return 360;
	}
	
	public int singLikeWookee() {
		System.out.println("aghaghaghaghaghagh");
		throw new RuntimeException();
//		return 720;
	}
	
	public void singLIkeVader() {
		System.out.println("boosh keee");
		return;
	}
	
	public String screamO() {
		System.out.println("yaaaaaaaaaaaaaaaahhhhhhhhhhhhhhhhhhhhhhh");
		return "hoarse now";
	}
	
	public void yellAtJsovani() {
		System.out.println("BAD JOSVANI");
		return;
	}
}
