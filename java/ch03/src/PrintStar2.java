
public class PrintStar2 {

	public static void main(String[] args) {
		for(int i=1; i<=5;i++) {
			//공백출력
			for(int j=1;j<=5-i ;j++) {
				System.out.print("");
			}
			//별을 출력
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i=1; i<=5;i++) {
			//공백출력
			for(int j=1;j<=6-i ;j++) {
				System.out.print("*");
			}
			//별을 출력
			for(int j=1;j<=i;j++) {
				System.out.print("");
			}
			System.out.println();
		}
	}

}
