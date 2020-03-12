package com.revature.algorithms;

import java.util.Arrays;

public class Driver {

  public static void main(String[] args) {
    // make a constant N:
    final int N = 10000;

    // Big O of n; linear time:
    int loopCounter = 0;
    for (int i = 0; i < N; i++) {
      // System.out.println("loop running");
      loopCounter++;
    }
    System.out.println("loop count: " + loopCounter);

    // Big O of n^2; polynomial time
    int nestedLoopCounter = 0;
    for (int i = 0; i < N; i++) {
      for (int j = 0; j < N; j++) {
        // System.out.println("nested loop running");
        nestedLoopCounter++;
      }
    }
    System.out.println("nested loop count: " + nestedLoopCounter);

    // Big O of 1; constant time
    int constantCounter = 0;
    constantCounter++;
    System.out.println("constant count: " + constantCounter);

    // Big O of log(n); logarithmic time
    // We see this very often when working with trees
    int logarithmCounter = 0;
    int n = N; // needed to change value of n while looping
    while (n > 1) {
      logarithmCounter++;
      // System.out.println("In dividing while loop");
      n = n / 2;
    }
    System.out.println("logarithm count: " + logarithmCounter);

    // Bubble sort: swap values when the L value is higher
    // than the R value. 2 (nested) loops are involved, so
    // worst-case time complexity is O(n^2);
    int bubbleCounter = 0;
    int[] arr = new int[] {4, 2, 1, 3, 70, 33, 1, 40, 9999, -300};
    for (int i = 0; i < arr.length - 1; i++) {
      for (int j = 0; j < arr.length - 1; j++) {
        int leftVal = arr[j];
        int rightVal = arr[j + 1];
        // System.out.println("Leftval: " + Integer.toString(leftVal));
        // System.out.println("Rightval: " + Integer.toString(rightVal));
        if (leftVal > rightVal) {
          arr[j + 1] = leftVal;
          arr[j] = rightVal;
        }
        bubbleCounter++;
      }
      System.out.println(Arrays.toString(arr));
    }
    
    System.out.println("BubbleSort count: " + bubbleCounter);

  }
  

}
