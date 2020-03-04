package oop;

/**
 * Driver is the class that we use to run our oop application
 * @author Revature
 *
 */
public class Driver {
	
	public static void main(String[] args) {
		//In order to create objects from a Class, we use the "new" keyword
		Account myAccount;
		myAccount = new Account();
		
		//We can set fields on our new Account object:
		myAccount.accountNumber = 40;
		myAccount.username = "adking08";
		myAccount.password = "wasspord";
		
		//We typically don't want to have to set every field after
		// creating an object.  We can use "Constructors" to initialize
		// our objects instead.
		Account myOtherAccount = new Account(3, "adking09", "wasspord");
		
		//We can also call any methods that exist on the object:
		System.out.println(myAccount.validate("adking08", "wasspord"));
		
		System.out.println("We've created an Account object, here are its fields:");
		System.out.println(myAccount);
		
		System.out.println("Details for my other Account:");		
		System.out.println(myOtherAccount);
	}

}
