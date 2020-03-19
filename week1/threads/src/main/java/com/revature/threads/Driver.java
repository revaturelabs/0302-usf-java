package com.revature.threads;

public class Driver {
  
  public static void main(String[] args) {
    //basicThreadDemo();
    expensiveDemo();
  }
  
  public static void expensiveDemo() {
    ExpensiveComputingObject eco = new ExpensiveComputingObject();
    System.out.println("ECO value: " + eco.getValue());
    eco.expensiveAddFifty();
    System.out.println("ECO value: " + eco.getValue());
  }
  
  public static void basicThreadDemo() {
    Thread myFirstThread = new Thread(new PrintOneToTen());
    //seems sensible but compilation error: new Thread(PrintOneToTen.class)
    myFirstThread.start();
    
    //Thread.join() will wait for a thread to complete before resuming execution.
    //the following line will make main() wait until myFirstThread is done executing:
    try {
      myFirstThread.join();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    
    
    //Below this point, run a Thread that prints out "A" 100 times
    // you'll need to create a new Class
    Thread mySecondThread = new Thread(new PrintAOneHundredTimes());
    mySecondThread.start();
    
    //using the method of extending Thread:
    Thread myThirdThread = new PrintOddNumbersOneToNineteenThread();
    myThirdThread.start();
  }
}
