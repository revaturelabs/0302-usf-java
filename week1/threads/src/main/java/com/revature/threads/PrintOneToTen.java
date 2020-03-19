package com.revature.threads;

public class PrintOneToTen implements Runnable {

  public void run() {
    for(int i=1; i<11; i++) {
      System.out.println(i);
      //manually slow down execution with Thread.sleep
      // Thread.sleep will pause execution for a number of milliseconds
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }

}
