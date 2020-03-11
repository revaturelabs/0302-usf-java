package felids;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Driver {

  public static void main(String[] args) {
    new Cat();
    Cat testCat = new Cat("Whiskers", Color.GREY, 220, Pattern.SOLID, Sex.MALE);
    System.out.println(new Cat());
    System.out.println(new Cat("Reginald"));
    System.out.println(new Cat("Garfield", Color.ORANGE));
    System.out.println(new Cat("Mufasa", Color.TAN, 200));
    System.out.println(new Cat("Heathcliff", Color.ORANGE, 250, Pattern.STRIPED));
    System.out.println(testCat);
    
    testCat.eat();
    testCat.vocalize();
    testCat.sleep();
    
    System.out.println(Cat.population);
    
    Tiger testTiger =  new Tiger("Tony", Color.ORANGE);
    testTiger.vocalize();
    testTiger.sleep();
    
    System.out.println(Tiger.population);
    
    testCat.greet();
    
    //in order to use TreeSet, must implement Comparable
    // not necessary for HashSet.
    Set<Cat> myCats = new TreeSet<Cat>();
    myCats.add(testCat);
    myCats.add(new Cat("Emmy", Color.ORANGE, 500));
    myCats.add(new Cat("Roger", Color.BROWN, 400));
    
    System.out.println(myCats);
    
    testCat.eat();
    testCat.eat("fish");
    testCat.eat(4);
    //varargs takes a variable number of arguments:
    testCat.eat("fish", "celery");
    testCat.eat("fish", "cat food", "mice", "cheese");
  }
}
