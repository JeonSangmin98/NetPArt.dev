
public class TypeCasting {

	public static void main(String[] args) {
		// 자동 형변환
		double num1 = 30;
		System.out.println(num1);
		
		System.out.println(59L + 34.5);
		
		int num3 = (int)20.5;	// 강제 형변환 | double형이 int형으로 바뀌면서 소수점 버림
		// double num4 = 20.5;
		System.out.println(num3);
		
		double num2 = 3.5f + 12; // -> 3.5f + 12f
		System.out.println(num2);
	}

}
