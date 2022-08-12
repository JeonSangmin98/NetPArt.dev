
public class AnonymousArray {
	public static void main(String[] args) {
		int[] temp = new int[] {1,2,3,4,5};
		System.out.println("숫자들의 합: "+sum(temp));
		
		// 무명 배열
//		System.out.println("숫자들의 합: "+sum(new int[]{1,2,3,4,5}));	
		
	}// main
	
	public static int sum(int[] numbers) {
		int total = 0;
//		for(int i=0;i<numbers.length;i++) {
//			total += numbers[i];
//		}
		// for-each 문
		for(int num : numbers) {
			total += num;
		}
		return total;
	}// sum
	
}// AnonymousArray