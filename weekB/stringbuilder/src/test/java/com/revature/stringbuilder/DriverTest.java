package com.revature.stringbuilder;

//This gets all the methods off the Assert class in JUnit.
import static org.junit.Assert.*;
import org.junit.Test;

public class DriverTest {
  
  @Test
  public void produceEmptyStringWithArgZero() {
    //We need to actually run the method we're testing in our test
    // in this case we pass in 0 because that's the case we want
    // to test:
    String result = Driver.produceStringOfAs(0);
    //Now we need to somehow check whether result is equal to "".
    // we do this with JUnit Assert methods.  These methods "assert"
    // some fact about the result of our method.  If our assertion is
    // correct, the test passes (everything works as expected).
    assertTrue(result.equals(""));
  }
  
}
