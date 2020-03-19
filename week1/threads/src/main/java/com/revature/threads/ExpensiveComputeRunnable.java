package com.revature.threads;

/**
 * A Runnable that runs the expensiveAddFifty() method on an ExpensiveComputingObject.
 * The user must pass in an ExpensiveComputingObject.
 * @author Revature
 *
 */
public class ExpensiveComputeRunnable implements Runnable {
  
  private ExpensiveComputingObject eco;
  
  public ExpensiveComputeRunnable(ExpensiveComputingObject eco) {
    this.eco = eco;
  }

  public void run() {
    
  }

}
