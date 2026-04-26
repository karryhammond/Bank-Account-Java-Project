package bankAccount.java;

//Part 2: Implement a CheckingAccount class that inherits from the BankAccount class, that: 
//
//Has an interest rate attribute
//Allows overdraft withdrawals and charges a $30 fee
//Methods:
//
//processWithdrawal() - will display a negative balance that includes a $30 overdraft fee and denotes that a fee has been assessed
//displayAccount() - should display all superclass attributes and provide an additional interest rate
//Ensure that your program has the two required classes and a test class.


public class checkingAccount extends bankAccount {
	double interestRate;
	
	checkingAccount(String firstName, String lastName, int accountID, double interestRate) {
		super(firstName, lastName, accountID);
		this.interestRate = interestRate;
	}
	
	public void processWithdrawals( double amount) {
		balance -= amount;
		
		if (balance < 0) {
			balance -= 30;
			System.out.println("Overdraft - $30");
		}
	}
	
	public void displayAccount() {
		System.out.println("\nName: " + getFirstName() + " " + getLasttName());
		System.out.println("\nAccount ID: " + getAccountID());
		System.out.println("\nBalance: " + getBalance());
		System.out.println("\nInterest Rate: " + interestRate);
	}
	
	
}
