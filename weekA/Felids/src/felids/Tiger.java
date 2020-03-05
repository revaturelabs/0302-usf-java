package felids;

public class Tiger extends Felid {
  
  static int population = 0;
  
  Tiger() {
    super();
    //All tigers are striped
    this.pattern = Pattern.STRIPED;
    Tiger.population++;
  }
  
  Tiger(String name) {
    this();
    this.name = name;
  }
  
  Tiger(String name, Color color) {
    this(name);
    this.color = color;
  }
  
  Tiger(String name, Color color, int size) {
    this(name, color);
    this.size = size;
  }
  
  Tiger(String name, Color color, int size, Sex sex) {
    this(name, color, size);
    this.sex = sex;
  }
  
  void vocalize() {
    roar();
  }
  
  void roar() {
    System.out.println(this.name + " says \"ROOAAARRR!\"");
  }

}
