package com.revature.stringbuilder;

public class Driver {
  
  public static void main(String[] args) {
    //StringBuilder should be faster with a large enough String
    
  }
  
  /**
   * Produces a string of the letter "A" repeated length times
   * i.e. produceStringOfAs(10) => "AAAAAAAAAA"
   * @param length
   * @return
   */
  public static String produceStringOfAs(int length) {
    String out = "";
    for(int i=0; i<length; i++) {
      out = out + "A";
    }
    return out;
  }
  
}
