package com.revature.exceptions;

public class Driver {
  
  public static void main(String[] args) {
    keywordDemo();
  }
  
  /**
   * First we're getting comfortable with the keywords and syntax.
   */
  public static void keywordDemo() {
    //our keywords are "throw", then "try" "catch" "finally", then "throws"
    //throw new RuntimeException(); //don't worry about "Runtime" just yet
    
    //nothing down here will run while an exception gets thrown above.
    //throw new RuntimeException("Exception with a message");
    
    //RuntimeException (and just Exception) are both generic.  We often want to use a more specific Exception
    //throw new NullPointerException();
  }

}
