import java.util.Scanner;

public class Lab1 {

	public static void main(String[] args) {
		int a;
		char score;
		
		Scanner input = new Scanner(System.in);
		System.out.print("성적을 입력하시오: ");
		a = input.nextInt();
		
		if(a>=90) {
//			System.out.print("학점 A");
			score = 'A';
		}else if(a >= 80) {
//			System.out.print("학점 B");
			score = 'B';
		}else if(a >= 70) {
//			System.out.print("학점 C");
			score = 'C';
		}else if(a >= 60) {
//			System.out.print("학점 D");
			score = 'D';
		}else {
//			System.out.print("학점 F");
			score = 'F';
		}
		
		System.out.printf("학점 %c", score);
		input.close();
	}

}
