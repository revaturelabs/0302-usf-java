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
    assertEquals(15, result);
  }
  
  @Test
  public void divideTenByTwoGetFive() {
    int result = basicCalc.divide(10, 2);
    assertEquals(5, result); //This gets us a nice failure trace
  }
  
  //This annotation means the test will pass if an ArithmeticException happens
  // This is a negative test: we're making sure our method fails appropriately
  @Test(expected = ArithmeticException.class)
  public void divideFiveByZeroThrowArithmeticException() {
    int result = basicCalc.divide(5,0);
  }
  
  @Test
  public void firstFibonacciNumberIsOne() {
    int result = basicCalc.fibonacci(0);
    assertEquals(1, result);
  }
  
  @Test
  public void fifthFibonacciNumberIsFive() {
    int result = basicCalc.fibonacci(4);
    assertEquals(5, result);
  }
  
  @Test
  public void eighthFibonacciNumberIsTwentyOne() {
    int result = basicCalc.fibonacci(7);
    assertEquals(21, result);
  }
}













