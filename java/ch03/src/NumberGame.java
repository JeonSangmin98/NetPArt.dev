import java.util.Random;
import java.util.Scanner;

public class NumberGame {

	public static void main(String[] args) {
		Random r = new Random();
		int answer = r.nextInt(100);
		int guess;
		Scanner scan = new Scanner(System.in);
		int tries = 0;
//		System.out.println(answer);
		
		do {
			System.out.print("정답을 추측하여 보시오: ");
			guess = scan.nextInt();
			
			if(guess>answer) {
				System.out.println("제시한 정수가 높습니다.");
			}
			if(guess<answer) {
				System.out.println("제시한 정수가 낮습니다.");
			}
			tries++;
		}while(answer != guess);
		
		System.out.println("축하합니다. 시도횠수="+tries);
	}

}
