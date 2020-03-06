package stringsarrays;

public class Driver {

  public static void main(String[] args) {
    
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
