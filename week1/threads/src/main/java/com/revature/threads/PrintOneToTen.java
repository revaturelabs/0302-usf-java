package com.revature.threads;

public class PrintOneToTen implements Runnable {

  public void run() {
    for(int i=1; i<11; i++) {
      System.out.println(i);
    }
  }

}
