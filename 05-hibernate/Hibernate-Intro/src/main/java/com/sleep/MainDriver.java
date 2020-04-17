package com.sleep;

import java.util.ArrayList;
import java.util.List;

import com.sleep.dao.RestaurantDao;
import com.sleep.model.Restaurant;

public class MainDriver {
	
	public static void main(String[] args) {
		RestaurantDao rd = new RestaurantDao();
		makeRes().stream().forEach(e->rd.save(e));
//		System.out.println(rd.getById(1));
//		System.out.println(rd.getById(2));
//		System.out.println(rd.getById(3));
		System.out.println(rd.findByName("burger king"));
	}
	
	static List<Restaurant> makeRes(){
		List<Restaurant> list = new ArrayList<>();
		list.add(new Restaurant(0,"burger king", true, 2.5));
		list.add(new Restaurant(0, "pyoy chikn", false, 4.0));
		list.add(new Restaurant(0, "gibson", true, 1.0));
		return list;
	}

}
