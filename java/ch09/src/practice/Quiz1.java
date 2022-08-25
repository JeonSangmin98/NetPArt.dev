package practice;

import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		// 1-100사이의 임의의 값을 얻어서 answer 저장
		int answer = (int)(Math.random()*100) + 1;
		int input = 0;	// 사용자 입력 저장 공간
		int count = 0;	// 시도 횟수
		Scanner scan;
		do {
			count++;
			System.out.print("1과 100 사이의 값을 입력하세요: ");
			try {
				scan = new Scanner(System.in);
				input = scan.nextInt();
			} catch (Exception e) {
				System.out.println("유효하지 않은 값입니다. 다시 값을 입력해주세요.");
				continue;
			}
			if( answer > input) {
				System.out.println("더 큰 수를 입력하세요.");
			}else if( answer < input) {
				System.out.println("더 작은 수를 입력하세요.");
			}else {
				System.out.println("맞췄습니다.");
				System.out.println("시도 횟수는 " + count + "번 입니다.");
				break;	// do-while 벗어남
			}
		}while(true);
		scan.close();
	}
}