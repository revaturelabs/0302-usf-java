package com.revature.tddcalc;

/**
 * Contains all the methods a basic calculator must implement.
 * @author Revature
 *
 */
public interface BasicCalculator {
  
  int add(int x, int y);
  
  int subtract(int x, int y);
  
  int multiply(int x, int y);
  
  int divide(int x, int y);
  
  /**
   * Returns the nth fibonacci number
   * @param n
   * @return
   */
  int fibonacci(int n);

}
