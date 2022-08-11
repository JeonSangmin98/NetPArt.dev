
public class CalSum {

	public static void main(String[] args) {
		int i=1;
		int sum=0;	// 0으로 초기화
		
		while(i <= 10) {
			sum = sum + i;
			i++;
		}
		System.out.println("합계 = " + sum);
		
		int a=3;
		int b=0;
		while(a<=555) {
			b = b + a;
			a++;
		}
		System.out.println("합계 = " + b);
	}

}
