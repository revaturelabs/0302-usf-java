package oop;

/**
 * A quick rewrite of Account, incorporating encapsulation and
 * automatically generated account numbers
 * @author Revature
 *
 */
public class AccountRewrite {
	
	static int totalNumberOfAccounts = 0;
	private int accountNumber;
	String username;
	String password;
	
	/*
	 * Constructor chaining is very common.  The no-args constructor has
	 * a call to super, and all other constructors call each other
	 * in a chain.
	 */
	AccountRewrite() {
		super();
		AccountRewrite.totalNumberOfAccounts += 1;
		this.accountNumber = AccountRewrite.totalNumberOfAccounts;
	}
	
	AccountRewrite(String username) {
		this();
		this.username = username;
	}
	
	AccountRewrite(String username, String password) {
		this(username);
		this.password = password;
	}
	
	@Override
		public String toString() {
			return "Account #" + this.accountNumber +
					", un: " + this.username;
		}

}
