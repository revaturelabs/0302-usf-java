package com.revature.threads;

public class Driver {
  
  public static void main(String[] args) {
    
    Thread myFirstThread = new Thread(new PrintOneToTen());
    //seems sensible but compilation error: new Thread(PrintOneToTen.class)
    myFirstThread.start();
    //Below this point, run a Thread that prints out "A" 100 times
    // you'll need to create a new Class
    Thread mySecondThread = new Thread(new PrintAOneHundredTimes());
    mySecondThread.start();
  }
}
