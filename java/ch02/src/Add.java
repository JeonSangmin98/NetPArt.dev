import java.util.Scanner;

public class Add {

	public static void main(String[] args) {
		// 준비 단계
		Scanner input = new Scanner(System.in);
		int x, y;
		int sum; // 결과(합) 저장
		
		// 입력 단계
		System.out.print("첫 번째 숫자 입력 : ");
		x = input.nextInt();
		System.out.print("두 번째 숫자 입력 : ");
		y = input.nextInt();
		
		sum = x + y;
		System.out.println("두 수의 합은? : " + sum);
	}

}
