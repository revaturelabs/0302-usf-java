package com.revature.reflections;

/**
 * Demo class for Reflections.  We'll inspect this class at runtime.
 * @author Revature
 *
 */
public class InspectMe {
  
  public InspectMe() {
    super();
    System.out.println("Inside of InspectMe constructor");
  }
  
  public int firstMethod(int i) {
    System.out.println("Inside of one parameter method");
    return 0;
  }
  
  public int secondMethod(int i, int j) {
    System.out.println("Inside of two parameter method");
    System.out.println("i + j = " + (i+j));
    return 0;
  }
  
  public int thirdMethod(int i, int j, int k) {
    System.out.println("Inside of three parameter method");
    return 0;
  }

}
