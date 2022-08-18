class BankAccount{
	private int balance = 10000;
	private int otherAccount;

	void deposit(int amount) {
		balance += amount;
	}
	void withdraw(int amount) {
		balance -= amount;
	}
	int getBalance() {
		return balance;
	}
	
	public void transfer(int amount, int otherAccount) {
		otherAccount = balance- amount;
	}
}

public class BankAccountTest {
	public static void main(String[] args) {
		BankAccount b = new BankAccount();
		System.out.println();
	}
}