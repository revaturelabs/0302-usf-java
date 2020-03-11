package com.revature.mydatastructures;

import java.util.ArrayList;

public class Driver {

  public static void main(String[] args) {
    MyStack testStack = new MyStack();
    
    testStack.push("hi");
    testStack.push("there");
    testStack.push("elements");
    System.out.println(testStack);
    System.out.println(testStack.pop());
    System.out.println(testStack.pop());
    System.out.println(testStack);
    System.out.println(testStack.pop());
    // ctrl + / for mass comment
    for(int i=0; i<20; i++) {
      testStack.push(Integer.toString(i));
    }
    
    System.out.println(testStack);
    
    //Justification for generics: Object type doesn't provide
    // compile-time type safety
    Object[] myObjects = new Object[3];
    
    myObjects[0] = "hello";
    myObjects[1] = "goodbye";
    myObjects[2] = new Double(4.09);
    
    for(int i=0; i<myObjects.length; i++) {
      System.out.println(myObjects[i]); //this is fine
      
      Object o = myObjects[i];
      //o.substring(2,4); //this doesn't work
      
      //cast to force type conversion:
      String s = (String) myObjects[i];
      //This gives us an Exception when we reach the Double in myObjects
      System.out.println(s.substring(2, 4));
    }
    
  }

}
