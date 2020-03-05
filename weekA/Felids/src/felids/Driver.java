package felids;

public class Driver {

  public static void main(String[] args) {
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
  }
}
