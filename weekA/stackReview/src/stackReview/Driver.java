package stackReview;

/**
 * No need to follow along coding here.  We're just doing a quick review.
 * @param args
 */
public class Driver {
  
  public static void main(String[] args) {
    //This is possible (think about why it is)
    Driver driver = new Driver();
    driver.printThings("argument!");
  }
  
  void oneMorePrint() {
    System.out.println("Hello World");
  }
  
  void printThings(String thing1) {
    System.out.println(thing1);
    printMore();
    System.out.println("Done printing things");
    
  }
  
  void printMore() {
    System.out.println("A");
    System.out.println("B");
    System.out.println("Call a method:");
    oneMorePrint();
    System.out.println("C");
  }
  
}
