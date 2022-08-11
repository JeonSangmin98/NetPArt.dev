import java.util.Scanner;

public class Divisor {

	public static void main(String[] args) {
		int n;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("양의 정수를 입력하시오: ");
		n = scan.nextInt();
		System.out.printf("%d의 약수는 다음과 같습니다.\n", n);
		for(int i=1; i <= n ; i++) {
			if((n%i)==0) {
				System.out.print(" " + i);
			}
		}
		scan.close();
	}

}
