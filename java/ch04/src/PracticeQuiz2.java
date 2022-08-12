import java.util.Random;

public class PracticeQuiz2 {
	public static void main(String[] args) {
		// 8번
//		double s[] = {1.0,2.0,3.0,4.0};
//		double sum=0;
//		double max=s[0];
//		
//		for(int i=0;i<s.length;i++) {
//			System.out.print(s[i] + " ");
//			sum += s[i];
//			
//			if(max <s[i]) {
//				max = s[i];
//			}
//		}
//		System.out.print("\n합은 " + sum);
//		System.out.print("\n최대값은 " + max);
		// 9번
//		String s[] = {"Hello","Java","World"};
//		for(int i=0;i<s.length;i++) {
//			System.out.println(s[i]);
//		}
		// 10번
//		String shape[] = {"Clubs","Diamonds","Hearts","Spades"};
//		String num[] = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
//		Random r = new Random();
//		
//		System.out.print(shape[(int)(Math.random()*4)] + "의 " + num[(int)(Math.random()*13)]);
//		System.out.print("\n"+shape[r.nextInt(4)] + "의 " + num[r.nextInt(13)]);
		
//		for(int i=0;i<shape.length;i++) {
//			
//			for(int j=0;j<num.length;j++) {
//				System.out.print(shape[i] + "의 "+ num[j] + "\n");
//			}
//		}
		// 13번
		int[] coinUnit = {500,100,50,10};
		
		int money=2680;
		System.out.println("money= "+ money);
		
		for(int i=0; i<coinUnit.length;i++) {
			System.out.println(coinUnit[i] + "원 " + money / coinUnit[i]);
			money = money % coinUnit[i];
		}
	} // main end

}
