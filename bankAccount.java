package bankAccount.java;

// Part 1: Implement a superclass BankAccount that has the following fields and methods.

//Fields:
//
//string firstName
//string lastName
//int accountID
//double balance
//Methods:  
//
//constructor() - initialize balance to zero
//deposit() - will accept a single value double parameter; the parameter value is added to the existing balance
//withdrawal() - accepts a single value double dollar amount; the parameter value is subtracted from the existing balance
//Setters and getters for firstName, lastName, and accountID
//getBalance() - getter to return the balance
//accountSummary() - prints all account information

public class bankAccount {
	 String firstName;
	 String lastName;
	 int accountID;
	 double balance;
	bankAccount(String firstName, String lastName, int accountID) {
		this.firstName = firstName; 
		this.lastName = lastName;
		this.accountID = accountID;
		this.balance = 0.0;
	}
	
		public double deposit(double money) {
		this.balance += money;
		return this.balance;
	}

		public double withdrawal(double amount) {
			this.balance = this.balance - amount;
			return this.balance;
		}
		
		public String getFirstName() {
			return firstName;
		}
		
		public String getLasttName() {
			return lastName;
		}
		
		public int getAccountID() {
			return accountID;
		}
		
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		
		public void setAccountID(int accountID) {
			this.accountID = accountID;
		}
		
		public double getBalance() {
			return this.balance;
		}
		
		public void accountSummary() {
			System.out.println("First Name: " + firstName + "Last Name: " + lastName + 
					"Account ID: " + accountID + "Balance: " + balance);
			
		}
}

























