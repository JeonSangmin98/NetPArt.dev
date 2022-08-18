public class MyCounterTest {
	public static void main(String[] args) {
		MyCounter obj1 = new MyCounter();
		MyCounter obj2 = new MyCounter(200);
		
		System.out.println("객체1의 counter " + obj1.getCounter());
		System.out.println("객체2의 counter " + obj2.getCounter());
		
		int x = 10;
		// 기초형 변수의 값을 매개변수로 복사
		// 값에 의한 호출 (call by value)
		x = obj1.inc(x);
		System.out.println("x: " + x);
		
		// 참조에 의한 호출(call by reference)
		// 객체의 참조값이 복사
		obj1.inc(obj1);
		System.out.println("객체1의 counter " + obj1.getCounter());
		
		int[] list = {1,2,3,4,5};
		for(int val:list)
			System.out.println(val + " ");
		System.out.println();
		obj1.inc(list);
		for(int val:list)
			System.out.println(val + " ");
	}
}