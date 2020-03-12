package com.revature.algorithms;

public class Driver {

  public static void main(String[] args) {
    // make a constant N:
    final int N = 16;

    //Big O of n; linear time:
    int loopCounter = 0;
    for (int i = 0; i < N; i++) {
      System.out.println("loop running");
      loopCounter++;
    }
    System.out.println("loop count: " + loopCounter);
    
    int nestedLoopCounter = 0;
    for(int i=0; i<N; i++) {
      for(int j=0; j<N; j++) {
        System.out.println("nested loop running");
        nestedLoopCounter++;
      }
    }
    System.out.println("nested loop count: " + nestedLoopCounter);
  }

}
