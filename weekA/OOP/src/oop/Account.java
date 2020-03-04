package oop;

/**
 * Account is a class that represents a user's account.
 * 
 * We often call classes that represent some piece of data
 * "model" classes, short for "data model".
 * @author Revature
 *
 */
//classes are written in UpperCamelCase
public class Account extends Object {
	
	//Everything inside of a class we call that classes' members
	// So the fields, methods, nested classes, constructors, ..
	// are all members of the class.
	
	//fields store state are are declared with a type:
	//fields are written in lowerCamelCase
	
	/**
	 * The number of existing accounts.  
	 * Used to generate new account numbers.
	 */
	static int totalNumberOfAccounts = 0;
	
	/**
	 * The number that identifies the account in our system
	 */
	int accountNumber;
	/**
	 * The username associated with the account
	 */
	String username;
	/**
	 * The password associated with the account
	 */
	String password;
	
	//This is the first constructor we'll be writing.  Every class starts
	// with a default constructor that takes no arguments and does
	// almost nothing.
	//This constructor works exactly the same as the default:
	Account() {
		//Even if we leave a constructor empty, the compiler will add
		// one call to super().  This is because every single constructor
		// must begin by calling either super() or this().
		
		//super() calls the super-class's constructor.
		//this() calls another constructor in the same class.
		//super() MUST eventually be called every time a constructor is used
		super();
		
		//Every time an account is created, increment the count of accounts
		Account.totalNumberOfAccounts++;
		
		//Set the account number
		this.accountNumber = Account.totalNumberOfAccounts;
	}
	
	//Multiple constructors are very common.  Here's one that lets us
	// initialize all the fields of our Account object:
	Account(int accountNumber, String username, String password) {
		super();
		this.accountNumber = accountNumber;
		this.username = username;
		this.password = password;
		
		//Every time an account is created, increment the count of accounts
		Account.totalNumberOfAccounts++;
		
		//Set the account number
		this.accountNumber = Account.totalNumberOfAccounts;
		System.out.println("Overriding manually input account number");
	}
	
	//Methods require a return type, and all their parameters
	// need to have an associated type:
	/**
	 * Validates whether a given un and pw match the un and pw of the Account.
	 * @param attemptedUsername
	 * @param attemptedPassword
	 * @return true if valid, false otherwise
	 */
	boolean validate(String attemptedUsername, String attemptedPassword) {
		//In order to check equality between objects generally,
		// we want to use their .equals() method.
		
		//The "this" keyword refers to the object itself and
		// can be used to access fields/methods
		return attemptedUsername.equals(this.username) &&
				attemptedPassword.equals(this.password);
	}
	
	//This will be the first method we override.  We'll override toString
	// to change printing behaviour.  Don't worry too much about the public
	// modifier right now.
	@Override
	public String toString() {
		return "Account #" + this.accountNumber +
				", Username: " + this.username +
				" Password: ********";
	}
	

}
