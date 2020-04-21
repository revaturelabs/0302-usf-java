/**
 * 
 */
package com.aspect;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aspect.activity.Singer;

public class Driver {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("bean-stew.xml");
		Singer s = ac.getBean(Singer.class);
//		s.singLikeWookee();
		s.yellAtJsovani();
	}

}
