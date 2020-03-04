/**
 * This is JavaDoc, one way of writing comments in Java
 * It can span multiple lines
 * and is used to describe the functionality/purpose
 * of methods, fields, classes, ...
 * 
 * @author Adam King
 */

/*
 * This is a multiline comment
 * see?
 */

// This is single line comment

/*
 * This is the package statement.  It goes at the top of every
 * Java file that is in a package.  A package is like a folder,
 * as well as being a namespace in Java.
 * 
 * The "fully qualified class name" of this class is
 * controlflow.Driver
 */
package controlflow;

/**
 * Driver is a common name for the class containing 
 * public static void main(String[] args), that 
 * actually runs the application.
 * @author Revature
 *
 */
public class Driver {
	
	public static void main(String[] args) {
		//We can write to the console with:
		System.out.println("Example writing to console");
		
		//If statements allow the flow of execution to branch
		// conditionally running a block of code
		boolean condition = false;
		
		if(condition) {
			System.out.println("Inside of the first if block");
		}
		
		//We don't have to define the condition ahead of time
		// and the condition can be an expression that is
		// evaluated.
		if(3+8 > 15) {
			System.out.println("3 + 8 is greater than 15");
		}
		
		int limit = 1;
		
		if(3 + 4 < limit) {
			System.out.println("3 plus 4 is less than " + limit);
		} else {
			System.out.println("3 plus 4 is not less than " + limit);
		}
		
		/*
		 * while provides looping functionality, where a single
		 * block of code (blocks are surrounded by {}) runs
		 * 0 or more times in a row.  In a while loop, the code
		 * will repeat until the condition is false.
		 */
		condition = true;
		while(condition) {
			System.out.println("Print forever");
			condition = false;
		}
		
		int counter = 0;
		while(counter < 20) {
			System.out.println("Counting in while: " + counter);
			counter = counter + 1;
			//a few options to do the above:
			//counter++;
			//++counter;
			//counter += 1;
		}
		
		/*
		 * A do-while loop is like a while loop, but the block of
		 * code runs 1 or more times, instead of running 0 or more
		 * times.
		 */
		do {
			System.out.println("Print inside of do-while loop");
		} while(false);
		
		/*
		 * for loops are very common, more common than while loops
		 * A for loop continues until a condition is met, and runs
		 * a statement after each iteration of the loop.  For loops
		 * are quite flexible, but are almost always used in this way:
		 */
		for(int i=0; i<10; i++) {
			System.out.println("Counting inside for loop " + i);
		}
		
		/*
		 * Less typical for loops:
		 */
		//This will run forever:
//		for(;;) {
//			System.out.println("print forever");
//		}
		
		//This doesn't just increment:
		for(int i=1; i<100; i *= 2) {
			System.out.println("i :" + i);
		}
		
		//This doesn't use ints:
		for(String s = ""; s.length()<10; s += "h") {
			System.out.println(s);
		}
		
		//switch is another control flow operator that allows
		// for branching behaviour.  Instead of having 2 possible
		// blocks of code to execute, a switch statement allows
		// many different blocks of code to potentially execute:
		String mySwitchingString = "dejvbkyadsvbasjkvbjakc";
		
		switch(mySwitchingString) {
		case "a":
			System.out.println("In switch case a");
			//a break statement takes you out of any
			//flow control structure.  It can be used in
			//loops as well as switches
			break;
		case "b":
			System.out.println("In switch case b");
			break;
		case "c":
			System.out.println("In switch case c");
			break;
		default:
			System.out.println("default switch case if no options match");
		}
	}
	
}
