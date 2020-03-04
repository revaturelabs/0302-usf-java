package felids;

public class Cat extends Felid {
	
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

}
