import java.util.Random;
import java.util.Scanner;

public class RandomNumberSol {

	public static void main(String[] args) {
		Random r = new Random();
		Scanner scan = new Scanner(System.in);
		System.out.print("난수의 개수 : ");
		int n = scan.nextInt();
		int sum = 0;
		
		for(int i=0; i<n; i++) {
			int number = r.nextInt(100);
//			System.out.print(number + " ");
			sum = sum + number;  // sum += number;
		}
		System.out.print("난수 " + n + "개의 합은 " + sum);
		scan.close();
	}

}
