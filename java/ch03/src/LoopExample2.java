import java.util.Scanner;

public class LoopExample2 {

	public static void main(String[] args) {
		int i=1;
		int n;
//		int n =5;
		Scanner scan = new Scanner(System.in);
		System.out.print("구구단 : ");
		n = scan.nextInt();
		while(i<10) {
//			System.out.println(i + "*" + n + "=" + n*i);
			System.out.printf("%d*%d=%d\n",n,i,n*i);
			i++;	// i = i+1, i += 1
		}
		
		for(i=1; i<10; i++) {
			System.out.printf("%d*%d=%d\n",n,i,n*i);
		}
	}

}
