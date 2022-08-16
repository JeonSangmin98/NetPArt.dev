public class MyMathTest {
	public static void main(String[] args) {
		MyMath obj = new MyMath();
		
		int sum = obj.add(2, 3);;
		System.out.println("2와 3의 합은 " + sum);
		System.out.println("7와 8의 합은 " + obj.add(7, 8));
		// 자료형을 보고 알아서 리턴 해줌
		System.out.println(obj.square(10));
		System.out.println(obj.square(3.14));
	}
}