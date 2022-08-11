import java.util.Scanner;

public class Quiz1 {

	public static void main(String[] args) {
		
		// 2번	: for(){} 중괄호 안함
//		int i=0;
//		for(int j=0; j < 10; j++) {
//			i = i + 1;
//		}
		
		// 3번
//		for(int i=0, j=0; j<100; j++) {
//			j += i; // j = j + i;
//		}
//		System.out.println(j);
	
		// 4번
//		int sum=0;
//		for(int i=1; i<=20; i++) {
//			if((i%2==0) || (i%3==0)) {
//				System.out.println(i);
//			}else {
//				sum = sum + i;
//			}
//		}
//		System.out.println("총합 : " + sum);
		
		// 5번

		int num=0;
		int count=0;
		int i=0;
		
		while(num <100) {
			count++;
			i++;
			if(i%2==0) {
				num = num+(i*-1);
			}else {
				num = num+i;
			}
//			System.out.println(num);
		}
		System.out.println("카운트 횟수"+ count);
	}

}
