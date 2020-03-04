package oop;

public class DriverRewrite {

	public static void main(String[] args) {
		for(int i=0; i<10; i++) {
			System.out.println(new AccountRewrite("User " + i));
		}
		
		AccountRewrite myAccount = new AccountRewrite();
		
		//This doesn't work because the field is private:
		//myAccount.accountNumber = 40;
		
		System.out.println(AccountRewrite.totalNumberOfAccounts);
	}

}
