class BankAccount{
	int accountNumber;
	String owner;
	int balance;
	
	// 입금
	void deposit(int amount) {
		balance += amount;
	}
	// 출금
	void withdraw(int amount) {
		balance -= amount;
	}
	// 송금
	public void transfer(int amount, BankAccount otherAccount) {
		this.withdraw(amount);
		otherAccount.deposit(amount);
	}
	// 잔액출력
	@Override
	public String toString() {
		return "현재 잔액은 : " + balance + "입니다.";
	}
	
	
}

public class BankAccountTest {
	public static void main(String[] args) {
		BankAccount myAccount1 = new BankAccount();
		BankAccount myAccount2 = new BankAccount();
		// 10000원 입금
		myAccount1.deposit(10000);
		System.out.println("myAccount1 : " + myAccount1);
		// 8000원 출금
		myAccount1.withdraw(8000);
		System.out.println("myAccount1 : " + myAccount1);
		System.out.println("myAccount2 : " + myAccount2);
		// 1000원 송금
		myAccount1.transfer(1000, myAccount2);
		System.out.println("myAccount1 : " + myAccount1);
		System.out.println("myAccount2 : " + myAccount2);
	}
}