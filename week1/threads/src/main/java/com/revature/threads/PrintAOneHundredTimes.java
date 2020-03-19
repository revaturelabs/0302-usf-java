package com.revature.threads;

public class PrintAOneHundredTimes implements Runnable{
public void run() {
  for(int i=0; i<100; i++) {
    System.out.println("A");
    try {
      Thread.sleep(500);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}

}
