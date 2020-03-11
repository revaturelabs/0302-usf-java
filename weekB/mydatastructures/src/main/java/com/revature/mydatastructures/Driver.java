package com.revature.mydatastructures;

import java.util.ArrayList;

public class Driver {

  public static void main(String[] args) {
    MyStack testStack = new MyStack();
    
    testStack.push("hi");
    testStack.push("there");
    testStack.push("elements");
    System.out.println(testStack.pop());
    System.out.println(testStack.pop());
    System.out.println(testStack.pop());
    // ctrl + / for mass comment
    for(int i=0; i<20; i++) {
      testStack.push(Integer.toString(i));
    }
    
    System.out.println(testStack);
    
  }

}
