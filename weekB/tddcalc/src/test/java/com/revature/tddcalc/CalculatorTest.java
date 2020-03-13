package com.revature.tddcalc;

//Canonical JUnit import statement:
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
  
  //This is the object we'll use to run our tests
  // private because we don't need access elsewhere
  private static BasicCalculator basicCalc;
  
  //@Before marks a method that will run before EVERY test.
  // We use it to provide the environment for our tests
  @Before
  public void setUp() {
    basicCalc = new MyCalculator();
    System.out.println("Before is running!");
  }
  
  //Similar to @Before, we have @After that runs after EVERY test.
  // We use it to remove the environment for that test.
  @After
  public void tearDown() {
    basicCalc = null;
    System.out.println("After is running!");
  }
  
  @Test
  public void addOneToTwoGetThree() {
    int result = basicCalc.add(1, 2);
    assertTrue(result == 3);
  }
  
  @Test
  public void addTenToZeroGetTen() {
    int result = basicCalc.add(10, 0);
    assertTrue(result == 10);
  }
  
  @Test
  public void subtractTenFromZeroGetNegativeTen() {
    int result = basicCalc.subtract(0, 10);
    assertTrue(result == -10);
  }
  
  @Test
  public void subtractFiveFromFiftyGetFortyFive() {
    int result = basicCalc.subtract(50, 5);
    assertTrue(result == 45);
  }
  
  @Test
  public void multiplyOneAndTenGetTen() {
    int result = basicCalc.multiply(1, 10);
    assertTrue(result == 10);
  }
  
  @Test
  public void multiplyThreeAndFiveGetFifteen() {
    int result = basicCalc.multiply(3, 5);
    assertEquals(result, 15);
  }
  
  //TODO: write tests for other methods!

}













