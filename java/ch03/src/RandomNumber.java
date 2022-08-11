import java.util.Random;
import java.util.Scanner;

public class RandomNumber {

	public static void main(String[] args) {
		Random r = new Random();
		
		
		int n;
		
		Scanner scan = new Scanner(System.in);
		System.out.printf("난수의 개수 : ");
		n = scan.nextInt();
		int sum=0;
		for(int i=0; i < n ; i++) {
//			r.nextInt(100);
			int number = r.nextInt(100);
//			System.out.print(number + " ");
			sum = sum + number;
		}
		System.out.printf("난수 %d개의 합은 %d", n ,sum);
		scan.close();
	}

}
