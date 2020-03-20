package com.revature.threads;

public class Driver {
  
  public static void main(String[] args) {
    //basicThreadDemo();
    //expensiveDemo();
    lambdaThreadDemo();
  }
  
  public static void lambdaThreadDemo() {
    //The first thread in basicThreadDemo() printed numbers one through ten.
    // we needed to create a class, and type a lot of boilerplate code.
    // lambda expressions will save us time and make our code clearer:
    //Thread myFirstThread = new Thread(new PrintOneToTen());
    Thread myFirstThread = new Thread(()->{
      //Inside of the curly braces we specify the body of the abstract method run()
      for(int i=1; i<11; i++) {
        System.out.println(i);
      }
    });
    myFirstThread.start();
    
    //Create and run a thread that prints out "lambdas are neat"
    Thread myLambdasAreNeatThread = new Thread(()-> {
      System.out.println("Lambdas are neat");
    });
    myLambdasAreNeatThread.start();
    
    //Create and run a thread that prints "hello", then "hellohello", then "hellohellohello", ... 
    // up to 10 repeated hellos
    //Use a lambda expression -- it will be faster
  }
  
  public static void expensiveDemo() {
    ExpensiveComputingObject eco = new ExpensiveComputingObject();
    System.out.println("ECO value: " + eco.getValue());

    //Create the runnable and pass it the object we want to use for computing.
    ExpensiveComputeRunnable ecr = new ExpensiveComputeRunnable(eco);
    Thread t1 = new Thread(ecr);
    t1.start();
    
    System.out.println("Expensive computation is now running in the background.");
    System.out.println("we're free to do other work in the main thread");
    System.out.println("If we want to wait for the computation to be done, we can use Thread.join()");
    
    System.out.println("We can start the expensive computation again with another thread, if we want to run it twice.");
    Thread t2 =  new Thread(ecr);
    t2.start();
    
    //Wait for both threads to complete:
    try {
      t1.join();
      t2.join();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    
   
    
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
