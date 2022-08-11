import java.util.Scanner;

public class Lab1 {

	public static void main(String[] args) {
		int a;
		int[] score = new int[5];
		int avg=0;
		int sum=0;
		Scanner scan = new Scanner(System.in);
		
		for(int i=0; i<score.length; i++) {
			System.out.print("성적을 입력하시오: ");
			a = scan.nextInt();
			score[i] = a;
			sum += score[i];
		}
		avg = sum / score.length;
		System.out.printf("평균 성적은 %d입니다.",avg);
	}

}
