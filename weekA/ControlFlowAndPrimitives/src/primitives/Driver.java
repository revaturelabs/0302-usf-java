package primitives;

//Fully qualified class name is "primitives.Driver"
public class Driver {
	
	public static void main(String[] args) {
		byte b = 3;
		short s = 3000;
		long l = 3L;
		int i = 3;
		boolean bool = true;
		float f = 3.0f;
		double d = 3.0;
		
		//The general rule is that you cannot convert type
		// if information might be lost:
		//b = s;
		//We can force conversion using casting:
		b = (byte) s;
		
		i = (int) l;
		
		l = i;
		
		//beware overflow
		System.out.println(b);
		
		//check the maximum and minimum values using:
		System.out.println("Max Values:");
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Short.MAX_VALUE);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Long.MAX_VALUE);
		
		/*
		 * Above, note that we're using "Byte" and "Integer". These
		 * are Objects that contain a primitive value.  We call them
		 * "Wrapper Classes" and we use them whenever we need Objects 
		 * instead of primitives.
		 * Java will "autobox" primitives into wrappers in most
		 * situations.
		 */
		
		Integer myInteger = i;
		Byte myByte = b;
		//etc.
		
		/*
		 * Notable wrapper class differences: they have methods
		 * myInteger.toString();
		 */
		
		
		/*
		 * Operators: typical mathematical operators:
		 * -, +, /, *, %
		 * increment and decrement:
		 * ++, --
		 * shortcut modification:
		 * +=, -=, *=, %=
		 * negation:
		 * !
		 * relational:
		 * ==, <, <=, >, >=, !=
		 * logical:
		 * &, |
		 * short-circuit logical:
		 * &&, ||
		 * ternary operator:
		 *  ? :
		 */
		
		/*
		 * Truth tables for logical operators:
		 * T & T = T
		 * T & F = F
		 * F & T = F
		 * F & F = F
		 * T | T = T
		 * T | F = T
		 * F | T = T
		 * F | F = F
		 */
		
		System.out.println("True and false:");
		System.out.println((3 < 2) && (4 < 6));
		
		int x = 0;
		// x++ is a postincrement operator on x.  It will return x, then add 1
		System.out.println(x++);
		System.out.println(x);
		
		// ++x is a preincrement operator on x.  It will add 1 to x, then return x
		System.out.println(++x);
		System.out.println(x);
		
		//The value of x is 2 right here.
		if((++x < 5) && (++x > 3)) {
			System.out.println("Both operands were true");
		}
		
		System.out.println(x); // x is 4 here
		
		if((++x < 6) || (++x < 6)) {
			System.out.println("At least one operand was true");
		}
		
		System.out.println(x); //what value does x have?
		
		//The ternary operator is like a shortened if-else:
		System.out.println((x==6) ? "x is 6" : "x is not 6");
	}

}
