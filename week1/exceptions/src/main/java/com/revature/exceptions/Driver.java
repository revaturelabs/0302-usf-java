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
    //don't throw inappropriate Exceptions or Errors
    
    //Null Pointer Exceptions occur ONLY when you try to call a method or access a field on something that is null.
    
    //We can even throw Errors:
    //throw new StackOverflowError();
    
    //unhandled exceptions crash your program.
    //let's handle the exception thrown here:
    //The "try" keyword marks a block of code for Exception handling.
    //The "catch" keyword specifies actions to take when a given Exception occurs.
    // We can use the catch keyword multiple times and define multiple "catch blocks" that
    // specify appropriate responses to each Exception.
    try { //this is the try-block, Exception handling occurs here.
      methodThrowsException();
    } catch (RuntimeException e) { //this is a catch-block for RuntimeExceptions
      System.out.println("Inside of RuntimeException catch block");
      System.out.println("RuntimeException message: " + e.getMessage());
    }
    //Once an Exception gets caught, it no longer crashes the program.  Instead, the code inside of the associated
    // catch-block runs.
    try {
      methodThrowsException();
    } catch(Exception e) { //This catch-block will catch ALL Exceptions (generally bad practice).
      System.out.println("Inside of Exception catch block");
    }
    
    try {
      methodThrowsException();
    } catch(ArithmeticException e) {
      System.out.println("Caught arithmetic Exception");
    } catch(RuntimeException e) {
      System.out.println("Caught RuntimeException");
    } catch(Exception e) {
      System.out.println("Caught generic Exception");
    }
    //The only rule for multiple catch blocks is that more general exceptions go last.
    
    //Finally, we have the "finally" keyword to specify code that should run
    // regardless of whether an Exception occurred.  "finally" ALMOST ALWAYS runs.
    
   try {
     //methodThrowsException();
     //System.out.println("inside try block, no Exception thrown");
     //throw new StackOverflowError(); //finally will run even if the program crashes
   } catch(RuntimeException e) {
     System.out.println("Caught runtime");
   } finally {
     System.out.println("This always runs!");
   }
   
   //it's less common, but we can have try-finally without a catch block in between.
   try {
     //System.exit(0); //hard exiting the program will skip finally
     // If the thread the program is running on gets killed some other way (from outside), that will skip finally.
//     while(true) {
//       //This stops finally for executing
//     }
     recursiveFinallyCheck(); //finally still runs even if we fill up the stack
   } finally {
     System.out.println("Does this always run?");
   }
    
  }
  
  public static void methodThrowsException() {
    throw new RuntimeException("Hello");
  }
  
  public static void recursiveFinallyCheck() {
    recursiveFinallyCheck();
  }
  
  
  
  
  
  
  
  
  
  
  
  

}
