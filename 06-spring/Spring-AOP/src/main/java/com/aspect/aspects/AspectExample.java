package com.aspect.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * 
 * @author Revature
 *
 *	Spring AOP is an implementation of aspectj. It
 *		simplifies AspectJ, but it reduces the functionality.
 *
 *	An aspect is an modularization of cross-cutting concerns.
 *		In java, it takes the form of a class. It is just a collection
 *		of advice (methods)
 *
 *	advice is an action taken by an aspect. takes the form of a method.
 *
 *	cross-cutting concerns: issues that cut across the code of your application.
 *		tangling			think spaghetti code
 *		scattering			think logging (method invokations all over the application)
 *
 *	joinpoints are the possible points in runtime of the program where an advice
 *		can be invoked. In spring aop, these points are method invokations. Joinpoints
 *		take the form of an object given to us by spring aop.
 *
 *	pointcuts are expressions that are used to select specific joinpoints.
 *		in other words, pointcuts target a subset of joinpoints. pointcuts 
 *		take the form of pointcut expressions (a string that uses regular expressions)
 *
 *	pointcut expressions:
 *		"*" is our wildcard for return types and method names
 *		".." is also our wildcard for parameters
 *
 *	pointcut timings/ advice timings
 *		Before			runs before the method executes
 *		After			runs after the method executes
 *		AfterReturning	runs after the method returns
 *		AfterThrowing	runs after the method throws an exception
 *		Around			runs before and after the method, depending on
 *							where you call the proceed method on the 
 *							proceeding joinpoint.
 *
 */

@Component
@Aspect
public class AspectExample {

	@Before("execution(* *(..))")
	public void printColor(JoinPoint jp) {
		System.out.println(jp.getSignature());
		System.out.println("color");
	}
	
	@After("execution(int sing*(..))")
//	@AfterReturning("execution(int sing*(..))")
//	@AfterThrowing("execution(int sing*(..))")
	public void runAfterSing(JoinPoint jp) {
		System.out.println("this method is singing");
	}
	
	@Around("execution(void *(..))")
	public void around(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("before or after or both?");
		pjp.proceed();
	}
	
}
