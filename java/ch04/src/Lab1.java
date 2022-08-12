import java.util.Scanner;

public class Lab1 {

	public static void main(String[] args) {
//		int a;
//		int[] score = new int[5];
//		int avg=0;
//		int total=0;
//		Scanner scan = new Scanner(System.in);
//		
//		for(int i=0; i<score.length; i++) {
//			System.out.print("성적을 입력하시오: ");
//			a = scan.nextInt();
//			score[i] = a;
//			total += score[i];
//		}
//		avg = total / score.length;
//		System.out.printf("평균 성적은 %d입니다.",avg);
		
		// 풀이
		final int STUDENTS = 5;
		int total = 0;
		Scanner scan = new Scanner(System.in);
		
		// scores 배열 선언하기
		int[] scores= new int[STUDENTS];
		
		for(int i=0; i<scores.length; i++) {
			System.out.print("성적을 입력하시오: ");
			scores[i] = scan.nextInt();
		}
		for(int i=0; i<scores.length ;i++) {
			total += scores[i];
		}
		System.out.println("평균 성적은" + (double)total/scores.length + "입니다.");
		scan.close();
	}

}
