package com.revature.threads;

public class PrintOddNumbersOneToNineteenThread extends Thread {

  @Override
  public void run() {
    for(int i=0; i<10; i++) {
      System.out.println(2*i + 1);
    }
  }
  
}
