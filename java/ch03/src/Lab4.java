import java.util.Random;
import java.util.Scanner;

public class Lab4 {

	public static void main(String[] args) {
		Random r = new Random();
		int number = r.nextInt(100);
		int n=0;
		int count=0;
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.print("정답을 추측하여 보시오 : ");
			n = scan.nextInt();
			if(n<number) {
				System.out.println("제시한 정수가 낮습니다.");
				count++;
				continue;
			}else if(n>number){
				System.out.println("제시한 정수가 높습니다.");
				count++;
				continue;
			}else {
				System.out.println("축하합니다. 시도횟수="+count);
				break;
			}
		}
	}

}
