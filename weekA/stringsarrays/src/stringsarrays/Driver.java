package stringsarrays;

import java.util.Arrays;

public class Driver {

  public static void main(String[] args) {
    //stringMethods();
    arrays();
  }
  
  public static void arrays() {
    /*
     * An array stores values (primitives and references both) in
     * sequence in memory.  We access those values via an index
     * that starts at 0.
     * 
     * Declare arrays using [].  You can specify the length
     * by putting a number in the brackets: [3], [10], ...
     * 
     * All arrays are typed, and the type must be consistent
     * for all elements.  We can't have Strings and ints in the
     * same array.
     */
    
    //An empty int array of length 10.  Since int is a primitive,
    // and can't be null, this array is full of 0s
    int[] myFirstArray = new int[10];
    //iterating through an array:
    for(int i=0; i<myFirstArray.length; i++) {
      System.out.println(myFirstArray[i]);
    }
    
    //We can initialize values with an array literal using {}
    int[] myArrayLiteral = new int[] {5,10,15,20};
    for(int i=0; i<myArrayLiteral.length; i++) {
      System.out.println(myArrayLiteral[i]);
    }
    
    //We can have arrays of objects.  In that case, the array contains references
    String[] myStrings = new String[] {"Hello", "World"};
    
    //The default printout for arrays is not particularly useful:
    System.out.println(myStrings);
    
    //To provide a nice printout, and for other useful array methods,
    // we have a *utility class* called Arrays.  Utility classes are built
    // to work with some other object and provide commonly used methods.
    System.out.println(Arrays.toString(myStrings));
    
    //A little practice:
    //set the values of myFirstArray to be even numbers 2 through 20:
    for(int i=0; i<10; i++) {
      myFirstArray[i] = 2 + i*2;
    }
    
    //add one to each value in myFirstArray
    for(int i=0; i<10; i++) {
      myFirstArray[i]++;
    }
    
    //sum all elements in myFirstArray
    int sum = 0;
    for(int i=0; i<10; i++) {
      sum = myFirstArray[i] + sum;
    }
    
    System.out.println(Arrays.toString(myFirstArray));
    System.out.println(sum);
    
    
    
  }
  
  public static void stringMethods() {
    /*
     * String methods: since Strings are immutable, any method that changes
     * a String returns a new String.
     */
    String example = "Hello World";
    System.out.println(example.length());
    System.out.println(example);
    System.out.println(example.toUpperCase());
    System.out.println(example);
    System.out.println(example.toLowerCase());
    System.out.println(example);
    System.out.println(example.charAt(6));
    System.out.println(example);
    System.out.println(example.replaceAll("ello", "NEWVALUE"));
    System.out.println(example);
    //Remove whitespace from both ends
    System.out.println("    trimmableString   ".trim());
    //split() creates an array of String by splitting the original string
    // on some substring.
    String[] mySplitString = example.split("l");
    for(int i=0; i<mySplitString.length; i++) {
      System.out.println(mySplitString[i]);
    }
    //split("") splits into one-letter Strings
    for(int i=0; i<example.split("").length; i++) {
      System.out.println(example.split("")[i]);
    }

  }
}
