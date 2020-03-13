package com.revature.algorithms;

import java.util.Arrays;

public class Driver {

  public static void main(String[] args) {
    bigO();
    bubbleSort();
    arrayOfArrays();
    //recursiveInfinitePrint();
    myUsefulRecursion(5);
    //What should myRecursiveFactorial(1) return? 1
    //What should myRecursiveFactorial(2) return? 2
    //What should myRecursiveFactorial(5) return? 120
    System.out.println(myRecursiveFactorial(5)); //120
    //Try to write a recursive sum, where
    // myRecursiveSum(n) => n + (n-1) + (n-2) + ... + 2 + 1;
  }
  
  /**
   * Factorial of n is n*(n-1)*(n-2)*...*2*1 and is represented
   *  with n!.  So:
   *  
   * 5! = 5*4*3*2*1 = 120 = 5 * 4!
   * 4! = 4*3*2*1 = 24 = 4 * 3!
   * 1! = 1
   * 10! = 3628800
   * 
   */
  public static int myRecursiveFactorial(int n) {
    //exit condition
    if(n==1) {
      return 1;
    }
    //recursive step
    return n*myRecursiveFactorial(n-1);
  }
  
  public static void myUsefulRecursion(int n) {
    //exit condition:
    if(n <= 0) {
      System.out.println("Done!");
    } else {
      myUsefulRecursion(n-1);
    }
  }
  
  public static void recursiveInfinitePrint() {
    System.out.println("This will happen until a Stack Overflow");
    recursiveInfinitePrint();
  }
  
  public static void arrayOfArrays() {
    //2D arrays are just arrays of arrays
    int[][] arrayOfIntArrays = new int[][] {{1,2},{4,3}};
    System.out.println(Arrays.deepToString(arrayOfIntArrays));
    //access the second element of the first array:
    System.out.println(arrayOfIntArrays[0][1]);
    //access the second element of the second array:
    System.out.println(arrayOfIntArrays[1][1]);
    //access the first element of the second array:
    System.out.println(arrayOfIntArrays[1][0]);
    //general rule: array[index of nested array][index of element]
  }

  public static void bigO() {
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

  }
  
  public static void bubbleSort() {
    // Bubble sort: swap values when the L value is higher
    // than the R value. 2 (nested) loops are involved, so
    // worst-case time complexity is O(n^2);
    /*
     * Instructions: - Start with 2 (nested) for loops. Each should loop to the array's length minus
     * 1. - inside the inner for loop, write an if statement comparing two adjacent values: arr[j] >
     * arr[j+1] - If the condition is true, swap those 2 values in the array, i.e. int temp =
     * arr[j]; arr[j] = arr[j+1]; arr[j+1] = temp;
     */
    int bubbleCounter = 0;
    int[] arr = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, -300};
    for (int i = 0; i < arr.length - 1; i++) {
      int swaps = 0; // track the number of actual swaps that occur
      for (int j = 0; j < arr.length - i - 1; j++) {
        int leftVal = arr[j];
        int rightVal = arr[j + 1];
        // System.out.println("Leftval: " + Integer.toString(leftVal));
        // System.out.println("Rightval: " + Integer.toString(rightVal));
        if (leftVal > rightVal) {
          arr[j + 1] = leftVal;
          arr[j] = rightVal;
          swaps++;
        }
        bubbleCounter++;
      }
      System.out.println(Arrays.toString(arr));
      if (swaps == 0) {
        break; // exit the outer loops
      }
    }

  }


}
