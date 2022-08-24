interface MyInterface2{
	void sayHello();
}
interface MyInterface3{
	void calculate(int x, int y);
}
class MyClass2 implements MyInterface2{
	@Override
	public void sayHello() {
		System.out.println("Hello!");
	}
}
public class LamdaTest {
	public static void main(String[] args) {
		// 1
		MyInterface2 mi = new MyClass2();
		mi.sayHello();
		
		// 2
		MyInterface2 mi2 = new MyInterface2() {
			@Override
			public void sayHello() {
				System.out.println("Hello! anonymus class");
			}
		};
		mi2.sayHello();
		
		// 3 , 인수가 없고 body 가 1줄인 람다식
		MyInterface2 mi3 = () -> System.out.println("Hello! lamda");
		mi3.sayHello();
		
		MyInterface3 mi4 = (a,b) -> {	// 2줄 이상 중괄호 사용
			int result = a*b;
			System.out.println("계산 결과는: " + result);
			};
		mi4.calculate(10, 20);
	}
}