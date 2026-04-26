package bankAccount.java;
public class testBankAccount {
	public static void main(String [] args) {
		checkingAccount acc1 = new checkingAccount(
				"Karry", 
				"Hammond",
				1523,
				0.05);
		
		System.out.print("\nAccount Info: ");
		acc1.displayAccount();
		
		acc1.deposit(200);
		System.out.println("\nAfter depositing $200");
		acc1.displayAccount();
		
		acc1.processWithdrawals(100);
		System.out.println("\nAfter withdrawing $100.");
		acc1.displayAccount();
		
		acc1.processWithdrawals(200);
		System.out.println("\nAfter overdraft withdrawal:");
		acc1.displayAccount();
	}
}