import java.util.Scanner;

public class Lab1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.print("문자열을 입력하세요 > ");
			String str = scan.nextLine();
			if(str.equals("quit") == true) {
				break;
			}
			if(str.startsWith("www")) {
				System.out.println(str + "은 'www'로 시작합니다.");
			}else {
				System.out.println(str + "은 'www'로 시작하지 않습니다.");
			}
		}// end while
		scan.close();
	}// end main
}// end class