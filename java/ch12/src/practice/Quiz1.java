package practice;

import java.util.Calendar;
import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		Scanner sc = new Scanner(System.in);
		System.out.print("년도를 입력: ");
		int year = sc.nextInt();
		System.out.print("월을 입력: ");
		int month = sc.nextInt();
		System.out.printf("\t\t    %d년 %d월\n",year,month);
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		cal.set(year, month -1,1);
		
		// 1일이 무슨 요일인지
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
		// \t를 이용하여 요일까지 이동
		for(int i=1;i<dayOfWeek;i++) {
			System.out.print("\t");
		}
		// 7보다 커지면 줄 바꾸기
		for(int i=1;i<=cal.getActualMaximum(Calendar.DATE);i++) {
			System.out.print(i+"\t");
			if(dayOfWeek % 7 == 0) {
				System.out.println();
			}
			dayOfWeek++;
		}
		
		
	}
}