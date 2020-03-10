package felids;

/**
 * A felid. Abstract Parent class of specific feline species (Cats, Tigers)
 * 
 * Abstract classes cannot be instantiated and can have abstract methods.
 * 
 * @author Revature
 *
 */
public abstract class Felid implements Predator, Comparable<Felid> {

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

  @Override
  //This compareTo will sort felids using the String.compareTo method
  // on their names.  It will be alphabetical (ASCII).
  public int compareTo(Felid o) {
    return this.name.compareTo(o.name);
  }

  //This compareTo will make larger Felids > smaller Felids
//  public int compareTo(Felid o) {
//    return this.size - o.size;
//  }

}
