package com.revature.threads;

public class Driver {
  
  public static void main(String[] args) {
    
    Thread myFirstThread = new Thread(new PrintOneToTen());
    myFirstThread.start();
  }
}
