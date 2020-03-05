package felids;

/**
 * A felid. Abstract classes cannot be instantiated and can have abstract methods.
 * 
 * @author Revature
 *
 */
public abstract class Felid {

  int size;
  Color color;
  Pattern pattern;
  Sex sex;
  String name;

  abstract void vocalize();

  void eat() {
    System.out.println(this.name + " is eating");
  }

  void sleep() {
    System.out.println(this.name + " is taking a nap");
  }

}
