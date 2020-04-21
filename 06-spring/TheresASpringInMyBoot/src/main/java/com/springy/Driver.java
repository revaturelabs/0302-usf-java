package com.springy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springy.service.MockService;

/**
 * 
 * @author Revature
 *
 *	what is spring?
 *		Spring is a module based, open source java framework
 *		it provides support for enterprise level applications
 *		it provides infrastructure so you can focus on your 
 *			applications business logic.
 *
 *	what is a module
 *		A grouping a of libraries that work together to achieve some 
 *			goal using reusable, abstracted code. In spring it is 
 *			spring dependency.
 *
 *	spring modules:
 *		beans, context, core, mvc, orm, aop, boot, data, security, web-flux etc.
 *
 *	
 */
public class Driver {

	public static void main(String[] args) {
		// the old way: MockService ms = new MockService(new MockDao());
//		System.out.println(ms.getAll());

//		we need to tell spring which config file to use, and instantiate
//			an implementation of the application context.
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
//		MockService ms = ac.getBean(MockService.class);
		MockService ms = (MockService) ac.getBean("mockWahlburg");
		ms = (MockService) ac.getBean("mockWahlburg");
		ms = (MockService) ac.getBean("mockWahlburg");
		ms = (MockService) ac.getBean("mockWahlburg");
		ms = (MockService) ac.getBean("mockWahlburg");
		ms = (MockService) ac.getBean("mockWahlburg");
		ms = (MockService) ac.getBean("mockWahlburg");
		ms = (MockService) ac.getBean("mockWahlburg");
		ms = (MockService) ac.getBean("mockWahlburg");
		ms = (MockService) ac.getBean("mockWahlburg");

		System.out.println(ms.getAll());
	}
}
