class Bank{
	Bank(){
		System.out.println("Bank()");
	}
	public double getInterestRate() {
		return 0.0;
	}
}
class BadBank extends Bank{
	BadBank(){
		super();
		System.out.println("BadBank()");
	}
	public double getInterestRate() {
		return 10.0;
	}
}
class NormalBank extends Bank{
	
	public NormalBank() {
		super();	// 부모클래스 생성자를 뜻함
		System.out.println("NormalBank()");
	}

	@Override
	public double getInterestRate() {
		return 5.0;
	}
}
class GoodBank extends Bank{
	@Override
	public double getInterestRate() {
		return 3.0;
	}
}
public class BankTest {
	public static void main(String[] args) {
		BadBank bb = new BadBank();
		NormalBank nb = new NormalBank();
//		GoodBank gb = new GoodBank();
//		
//		System.out.println("BadBank의 이자율: " + bb.getInterestRate());
//		System.out.println("NormalBank의 이자율: " + nb.getInterestRate());
//		System.out.println("GoodBank의 이자율: " + gb.getInterestRate());
	}
}