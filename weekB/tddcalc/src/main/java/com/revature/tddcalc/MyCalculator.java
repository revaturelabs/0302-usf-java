package com.revature.tddcalc;

public class MyCalculator implements BasicCalculator {

  @Override
  public int add(int x, int y) {
    return x + y;
  }

  @Override
  public int subtract(int x, int y) {
    return x - y;
  }

  @Override
  public int multiply(int x, int y) {
    return x * y;
  }

  @Override
  public int divide(int x, int y) {
    return x / y;
  }

  @Override
  public int fibonacci(int n) {
    //set up an array to contain all the fibonacci numbers we produce.
    int[] fibonacciNumbers = new int[n + 2];
    
    //This logic actually produces the fibonacci numbers and places them in our array
    //Here we initialize the the first 2 fibonacci numbers:
    fibonacciNumbers[0] = 1; //initialize fibbonaci 0
    fibonacciNumbers[1] = 1; //initialize fibbonaci 1
    //This logic produces new fibbonaci numbers from previous ones
    for(int i=2; i<fibonacciNumbers.length; i++) {
      fibonacciNumbers[i] = fibonacciNumbers[i-1] + fibonacciNumbers[i-2];
      System.out.println(fibonacciNumbers[i] + " = " + fibonacciNumbers[i-1] + " + " + fibonacciNumbers[i-2]);
    }
    
    //return the asked-for fibonacci number, that we retrieve from our array
    // fibonacci(4) will get the 4th (0-indexed) fibonacci number from our array
    // and return it.
    return fibonacciNumbers[n];
  }

}
