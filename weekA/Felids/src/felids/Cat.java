package felids;

import java.io.Serializable;

public class Cat extends Felid implements Domesticated, Serializable {

  static int population = 0;

  Cat() {
    super();
    Cat.population++;
  }

  Cat(String name) {
    this();
    this.name = name;
  }

  Cat(String name, Color color) {
    this(name);
    this.color = color;
  }

  Cat(String name, Color color, int size) {
    this(name, color);
    this.size = size;
  }

  Cat(String name, Color color, int size, Pattern pattern) {
    this(name, color, size);
    this.pattern = pattern;
  }

  Cat(String name, Color color, int size, Pattern pattern, Sex sex) {
    this(name, color, size, pattern);
    this.sex = sex;
  }

  @Override
  void vocalize() {
    mew();
  }

  void mew() {
    System.out.println(this.name + " says \"MEOW\"");
  }
  
  @Override
  public void greet() {
    System.out.println(this.name + " encounters a person...");
    mew();
  }

  @Override
  public String toString() {
    return this.name + ", a " 
        + this.pattern + " " + this.color + " " + this.sex + " cat" +
        " that is " + this.size + " units big.";
  }

}
