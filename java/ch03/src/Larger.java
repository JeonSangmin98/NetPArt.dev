import java.util.Scanner;

public class Larger {

	public static void main(String[] args) {
		int a,b,result;
		
		Scanner input = new Scanner(System.in);
		System.out.println("첫 번째 정수: ");
		a = input.nextInt();
		
		System.out.println("두 번째 정수: ");
		b = input.nextInt();
		
		if (a > b) {
			result = a;
		} else {
			result = b;
		}
		System.out.println("큰 수는 : " + result);
		
		input.close();
	}

}
