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
    System.out.println(this.name + " is eating something unspecified");
  }
  
  void eat(String food) {
    System.out.println(this.name + " is eating " + food);
  }
  
  void eat(Integer food) {
    System.out.println(this.name + " can't eat numbers");
  }
  
  //varargs food: varargs means a variable number of arguments
  // instead of defining one method for each number, we define
  // one method that takes varargs:
  void eat(String... foods) {
    //In here, foods is a String[].
    for(int i=0; i<foods.length; i++) {
      this.eat(foods[i]);
    }
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
