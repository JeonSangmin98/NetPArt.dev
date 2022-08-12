import java.util.Scanner;

public class Lab4 {

	public static void main(String[] args) {
		// 특정한 값 찾기
//		int s[] = {0,10,20,30,40,50,60,70,80,90,100};
//		int input;
//		Scanner scan = new Scanner(System.in);
//		System.out.print("탐색할 값을 입력하시오: ");
//		input = scan.nextInt();
//		for(int i=0; i<s.length; i++) {
//			if(input==s[i]) {
//				System.out.print(input + "값은 "+ i +"위치에 있습니다.");
//				break;
//			}	
//		}
//		scan.close();
		// 풀이
		int s[] = {0,10,20,30,40,50,60,70,80,90,100};
		int value, index=-1;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("탐색할 값을 입력하시오:");
		value = scan.nextInt();
		for(int i=0;i<s.length;i++) {
			if(value == s[i]) {
				index = i;
				break;
			}
		}
		if(index >= 0) {
			System.out.println(""+value+"값은 "+index+"위치에 있습니다.");
		}else {
			System.out.println(""+value+"값은 존재하지 않습니다.");
		}
		
		scan.close();
	}
}