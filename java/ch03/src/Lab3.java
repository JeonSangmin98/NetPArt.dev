import java.util.Scanner;

public class Lab3 {

	public static void main(String[] args) {
		int month,days=0;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("일수를 알고 싶은 월을 입력하시오 : ");
		month = scan.nextInt();
		
		
		switch(month) {
		case 2:
			System.out.println("월의 날수는 28");
			break;
		case 1:
		case 3:
		case 4:
		case 5:
		case 6:
		case 7:
		case 8:
		case 9:
		case 10:
		case 11:
		case 12:
			System.out.println("월의 날수는 31");
			break;
		default:
			System.out.println("잘못 입력했습니다.");
			break;
		}
	}

}
