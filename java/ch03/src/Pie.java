import java.util.Scanner;

public class Pie {

	public static void main(String[] args) {
		double divisor,dividend,sum;
		int loop_count;
		Scanner scan = new Scanner(System.in);
		divisor = 1.0;
		dividend = 4.0;
		sum = 0.0;
		System.out.print("반복횟수: ");
		loop_count = scan.nextInt();
		
		
		while(loop_count>0) {
			sum += dividend/divisor;
			dividend = -1.0*dividend;
			divisor = divisor + 2.0;
			--loop_count;
		}
		
		System.out.print("Pi = " + sum);
	}	

}
