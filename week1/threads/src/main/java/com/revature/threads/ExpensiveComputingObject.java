package com.revature.threads;

/**
 * Simulates an object that does expensive computation.
 * For the demon, ExpensiveCOmputingObject is just going to add 50 to a value very slowly.
 * @author Revature
 *
 */
public class ExpensiveComputingObject {
  
  /**
   * The value that our ExpensiveComputingObject increments by 50.
   */
  private Integer value = 0;
  
  /**
   * Adds 50 to the field value, incrementing by 1 50 times and waiting 200ms between each addition.
   */
  public void expensiveAddFifty() {
    for(int i=0; i<50; i++) {
      Integer oldValue = getValue();
      //Here is the "expensive" part: adding 1 will take 200 milliseconds
      try {
        Thread.sleep(200);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      Integer newValue = oldValue + 1;
      setValue(newValue);
    }
  }

  public Integer getValue() {
    return value;
  }

  public void setValue(Integer value) {
    this.value = value;
  }

}
