package heapreview;

public class Driver {

  public static void main(String[] args) {
    Integer a = new Integer(3);
    Integer b = new Integer(6);
    Integer c = b;

    // == for numbers we're familiar with
    // == for objects compares their reference (address)
    // So two references will only be == if they refer
    // to the same object.
    // Mostly, we use .equals() instead for objects

    System.out.println(a == b); // false
    System.out.println(a == c); // false
    System.out.println(b == c); // true

    // null is a special value that means a reference points to nothing
    b = null;
    System.out.println(b);
    System.out.println(c);

    // How will this change what's on the board?
    b = a;
    a = c;
    c = b;
    b = a;

    System.out.println(a + " " + b + " " + c);

    System.out.println("String Pool:");
    String alpha = "hello";
    String beta = "hi";
    String gamma = "hello";

    /*
     * The String pool stores string literals. Strings are immutable so repeated String literals
     * will be reused
     */
    System.out.println(alpha == beta); // false
    System.out.println(alpha == gamma); // true
    System.out.println(beta == gamma); // false

    System.out.println(new Integer(3) == new Integer(3)); // false
    System.out.println((new Integer(3)).equals(new Integer(3))); // true

    // edgeCase points to a String object with value "Hello World" OUTSIDE the
    // String Pool. This line creates 2 String objects with the same value:
    String edgeCase = new String("Hello World");
    // edgeCase2 points to a String object with value "Hello World" INSIDE the
    // String Pool.
    String edgeCase2 = "Hello World";
    System.out.println(edgeCase == edgeCase2); // false
    System.out.println(edgeCase.equals(edgeCase2)); // true

  }

}
