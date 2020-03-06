package felids;

/**
 * A Domesticated animal has been bred to be tamed.
 * 
 * An Interface is like a contract.  Classes that implement it
 * must implement its methods.  This Domesticated interface requires
 * that Domesticated Felids implement the greet() method.
 * 
 * Our interfaces have methods that are public and abstract.
 * We can implement methods in an interface ONLY if we mark
 * that method as "default".
 * 
 * Our interfaces can have fields, but those fields
 * MUST BE both static and final.  This makes Interface fields
 * like global constants
 * 
 * A Class can implement as many Interfaces as you desire.
 * 
 * @author Revature
 *
 */
public interface Domesticated {
  
  /**
   * Domesticated animals greet humans.
   */
  void greet();
  
  default void nuzzle() {
    System.out.println("Domesticated animal is friendly!");
  }
  
  default void getPet() {
    System.out.println("Domesticated animal gets petted");
  }
  
}
