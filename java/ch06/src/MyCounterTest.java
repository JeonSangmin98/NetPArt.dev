public class MyCounterTest {
	public static void main(String[] args) {
		MyCounter obj1 = new MyCounter();
		MyCounter obj2 = new MyCounter(200);
		
		System.out.println("객체1의 counter " + obj1.getCounter());
		System.out.println("객체2의 counter " + obj2.getCounter());
	}
}