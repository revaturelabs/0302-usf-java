package com.revature.mydatastructures;

public class Driver {

  public static void main(String[] args) {
    MyStack testStack = new MyStack();
    
    testStack.push("hi");
    testStack.push("there");
    testStack.push("elements");
    for(int i=0; i<20; i++) {
      testStack.push(Integer.toString(i));
    }
    
    System.out.println(testStack);
    
  }

}
