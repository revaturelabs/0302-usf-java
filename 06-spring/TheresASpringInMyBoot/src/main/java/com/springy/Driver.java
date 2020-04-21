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
 *	how does spring achieve its goals
 *		Inversion of control (IOC)
 *		Model View Controller (MVC)
 *		Abstraction api
 *		reflection api
 *		Aspect Oriented Programming (AOP)
 *
 *	what is bean wiring
 *		creating an association between spring's container and an 
 *			object you want spring to manage for you. as well as defining
 *			which beans are dependencies of others.
 *
 *	benefits of DI
 *		scalability, maintainability, cleaner code, testability, reduces complexity, loose coupling (decouples our code)
 *
 *		application context is a bean factory (ApplicationContext [interface], BeanFactory [interface])
 *			it adds more functionality such as:
 *				Internationalization, Annotation support, Enterprise services, etc.
 *	
 */
public class Driver {

	public static void main(String[] args) {
		// the old way: MockService ms = new MockService(new MockDao());
//		System.out.println(ms.getAll());

		//here we are using xml configuration for beans
		
//		we need to tell spring which config file to use, and instantiate
//			an implementation of the application context.
//		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
//		MockService ms = ac.getBean(MockService.class);
//		MockService ms = (MockService) ac.getBean("mockWahlburg");
//		ms = (MockService) ac.getBean("mockWahlburg");
//		ms = (MockService) ac.getBean("mockWahlburg");
//		ms = (MockService) ac.getBean("mockWahlburg");
//		ms = (MockService) ac.getBean("mockWahlburg");
//		ms = (MockService) ac.getBean("mockWahlburg");
//		ms = (MockService) ac.getBean("mockWahlburg");
//		ms = (MockService) ac.getBean("mockWahlburg");
//		ms = (MockService) ac.getBean("mockWahlburg");
//		ms = (MockService) ac.getBean("mockWahlburg");
		
		
		
		
		
		//from here we are using package scanning
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans2.xml");
		
		MockService ms = (MockService) ac.getBean("service");

//		System.out.println(ms.getAll());
	}
}
