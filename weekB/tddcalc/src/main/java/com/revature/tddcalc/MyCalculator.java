package com.revature.tddcalc;

public class MyCalculator implements BasicCalculator {

  @Override
  public int add(int x, int y) {
    return x+y;
  }

  @Override
  public int subtract(int x, int y) {
    return x-y;
  }

  @Override
  public int multiply(int x, int y) {
    return x*y;
  }

  @Override
  public int divide(int x, int y) {
    return x / y;
  }

  @Override
  public int fibonacci(int n) {
    // TODO Auto-generated method stub
    return 0;
  }

}
