package com.revature.mydatastructures;

import java.util.Arrays;

public class MyStack {
  
  String[] contents;
  int currentIndex;
  
  MyStack() {
    super();
    //new String array of length 10 -- 10 initial capacity
    this.contents = new String[10];
    this.currentIndex = -1;
  }
  
  void push(String element) {
    this.currentIndex++;
    this.contents[currentIndex] = element;
  }
  
  /**
   * Doubles the length of the contents array,
   * preserving existing values
   */
  void doubleCapacity() {
    String[] temp = this.contents;
    this.contents = new String[temp.length*2];
    for(int i=0; i<temp.length; i++) {
      this.contents[i] = temp[i];
    }
  }

  @Override
  public String toString() {
    return "MyStack [contents=" + Arrays.toString(contents) + ", currentIndex=" + currentIndex
        + "]";
  }

}
