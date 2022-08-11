import java.util.Scanner;

public class Averager {

	public static void main(String[] args) {
		int total=0;
		int count=0;
		Scanner scan = new Scanner(System.in);
		
		// while 문 1
//		while(true) {
//			System.out.print("정수를 입력하세요. : ");
//			int grade = scan.nextInt();
//			if(grade<0) {
//				break;
//			}
//			total += grade;
//			count++;
//		}
		
		// do while 문
//		int grade;
//		do {
//			System.out.print("정수를 입력하세요. : ");
//			 grade = scan.nextInt();
//			 if(grade > 0) {
//				total += grade;
//				count++; 
//			 }
//		}while(grade>=0);
		
		// while 문 2
		int grade = 0;
		while(grade>=0) {
			System.out.print("정수를 입력하세요. : ");
			grade = scan.nextInt();
			if(grade>=0) {
				total += grade;
				count++;
			}
		}
		
		System.out.println("평균은 " + total/count);
	}
}